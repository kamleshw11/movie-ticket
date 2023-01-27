package com.cybage.movieticket.service;

import com.cybage.movieticket.domain.Movie;

import java.util.List;

public interface MovieService {
    public void addMovie(Movie movie);
    public void updateMovie(Movie movie);
    public void deleteMovie(Long movieId);
    public List<Movie> findByName(String name);
    public List<Movie> findAll(int page, int size);
}
