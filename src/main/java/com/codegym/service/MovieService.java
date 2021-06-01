package com.codegym.service;

import com.codegym.exception.ServiceException;
import com.codegym.model.MovieModel;
import com.codegym.util.SearchCriteria;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface MovieService {
    List<MovieModel> findALLMovie(int movieId) throws ServiceException;

    Optional<MovieModel> findMovie(int movieId) throws ServiceException;

    boolean updateMovie(MovieModel movieModel) throws ServiceException;

    boolean addMovie(MovieModel movieModel) throws ServiceException;

    boolean deleteMovie(int movieId) throws ServiceException;

    List<MovieModel> findALlMoviesForAdmin() throws ServiceException;

    List<MovieModel> searchMovies(Map<SearchCriteria, String> searchMap, int page, int count) throws ServiceException;
}
