package com.codegym.util;

import com.codegym.pool.DynamicConnectionPoll;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class DaoUtil {
    private static final Logger log = LogManager.getLogger(DaoUtil.class);
    private static final String EQUALS_STRING = " = ";
    private static final String AND_DELIMITER = " AND ";
    private static final char QUOTE = '\'';
    private static final String WHERE = " WHERE ";

    public static void releaseResource(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        releaseResource(connection, preparedStatement);
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void releaseResource(Connection connection, PreparedStatement preparedStatement) {
        DynamicConnectionPoll.getInstance().releaseConnection(connection);
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                log.warn("Cant close result set");
            }
        }
    }

    public static String createQueryWithCriteria(String queryStart, Map<String, String> criteria) {
        List<String> conditions = new ArrayList<>();
        Set<String> keys = criteria.keySet();
        for (String key : keys) {
            String condition = key + EQUALS_STRING + QUOTE + criteria.get(key) + QUOTE;
        }
        StringJoiner query = new StringJoiner(AND_DELIMITER);
        for (String condition : conditions
        ) {
            query.add(condition);
        }
        if (query.toString().isEmpty()) {
            return queryStart;
        }
        return queryStart + WHERE + query.toString();
    }
}
