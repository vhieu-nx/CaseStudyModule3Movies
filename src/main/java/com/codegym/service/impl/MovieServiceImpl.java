package com.codegym.service.impl;

import com.codegym.exception.ServiceException;
import com.codegym.model.MovieModel;
import com.codegym.service.MovieService;
import com.codegym.util.SearchCriteria;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MovieServiceImpl implements MovieService {

    @Override
    public List<MovieModel> findALLMovie(int movieId) throws ServiceException {
        return null;
    }

    @Override
    public Optional<MovieModel> findMovie(int movieId) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public boolean updateMovie(MovieModel movieModel) throws ServiceException {
        return false;
    }

    @Override
    public boolean addMovie(MovieModel movieModel) throws ServiceException {
        return false;
    }

    @Override
    public boolean deleteMovie(int movieId) throws ServiceException {
        return false;
    }

    @Override
    public List<MovieModel> findALlMoviesForAdmin() throws ServiceException {
        return null;
    }

    @Override
    public List<MovieModel> searchMovies(Map<SearchCriteria, String> searchMap, int page, int count) throws ServiceException {
        return null;
    }
}
