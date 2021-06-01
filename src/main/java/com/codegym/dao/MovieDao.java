package com.codegym.dao;

import com.codegym.exception.DaoException;
import com.codegym.model.MovieModel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface MovieDao {
    List<MovieModel> findAll() throws DaoException;

    List<MovieModel> findAllByCriteria(Map<String, String> criteria) throws DaoException;

    Optional<MovieModel> findById(int movieId) throws DaoException;

    boolean update(MovieModel movie) throws  DaoException;

    boolean save(MovieModel movie) throws  DaoException;

    boolean delete(int movieId) throws DaoException;
}
