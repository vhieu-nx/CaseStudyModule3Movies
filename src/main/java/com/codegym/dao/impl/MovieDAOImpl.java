package com.codegym.dao.impl;

import com.codegym.dao.MovieDao;
import com.codegym.dao.query.MovieQuery;
import com.codegym.exception.DaoException;
import com.codegym.model.MovieModel;
import com.codegym.pool.DynamicConnectionPoll;
import com.codegym.util.DaoUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class MovieDAOImpl implements MovieDao {
    private static final String MOVIE_ID = "movie_id";

    @Override
    public List<MovieModel> findAll() throws DaoException {
        return findAllByCriteria(new HashMap<>());
    }

    @Override
    public List<MovieModel> findAllByCriteria(Map<String, String> criteria) throws DaoException {
        List<MovieModel> movieModels = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String query = "";
        connection = DynamicConnectionPoll.getInstance().provideConnection();
        query = DaoUtil.createQueryWithCriteria(MovieQuery.FIND_ALL_MOVIE,criteria);
        return null;
    }

    @Override
    public Optional<MovieModel> findById(int movieId) throws DaoException {
        return Optional.empty();
    }

    @Override
    public boolean update(MovieModel movie) throws DaoException {
        return false;
    }

    @Override
    public boolean save(MovieModel movie) throws DaoException {
        return false;
    }

    @Override
    public boolean delete(int movieId) throws DaoException {
        return false;
    }
}
