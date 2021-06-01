package com.codegym.dao.factory;

import com.codegym.dao.MovieDao;
import com.codegym.dao.impl.MovieDAOImpl;

public class DaoFactory {
    private static volatile DaoFactory instance;
    private final MovieDao movieDao = new MovieDAOImpl();
    private DaoFactory(){}
    public static DaoFactory getInstance() {
        if (instance == null) {
            synchronized (DaoFactory.class) {
                if (instance == null) {
                    instance = new DaoFactory();
                }
            }
        }
        return instance;
    }

    public MovieDao getMovieDao() {
        return movieDao;
    }
}
