package com.cybage.movieticket.repository;

import com.cybage.movieticket.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("SELECT m FROM Movie m WHERE m.name LIKE :name")
    List<Movie> findByName(@Param("name") String name);

    @Query(value = "SELECT m FROM Movie m")
    List<Movie> findAll(Pageable pageable);
}


