package com.cybage.movieticket.controller;


import com.cybage.movieticket.domain.Movie;
import com.cybage.movieticket.service.MovieServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieServiceImpl movieServiceImpl;

    @PostMapping("/add")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie) {
        movieServiceImpl.addMovie(movie);
        return new ResponseEntity<>(" movie added successfully...", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> bookMovie(@PathVariable long id) {
        movieServiceImpl.deleteMovie(id);
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public List<Movie> findByName(@PathVariable String name) {
        return movieServiceImpl.findByName(name);
    }

    @GetMapping("/all")
    public List<Movie> findAll(@RequestParam int page, @RequestParam int size) {
        return movieServiceImpl.findAll(page, size);
    }
}
