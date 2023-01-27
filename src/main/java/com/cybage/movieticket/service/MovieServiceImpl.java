package com.cybage.movieticket.service;

import com.cybage.movieticket.domain.Movie;
import com.cybage.movieticket.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {
    private  MovieRepository movieRepository;

    @Override
    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void updateMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(Long movieId) {
        movieRepository.deleteById(movieId);
    }

    public List<Movie> findByName(String name) {
        return movieRepository.findByName(name);
    }

    public List<Movie> findAll(int page, int size) {
        return movieRepository.findAll(PageRequest.of(page, size)).getContent();
    }
}

