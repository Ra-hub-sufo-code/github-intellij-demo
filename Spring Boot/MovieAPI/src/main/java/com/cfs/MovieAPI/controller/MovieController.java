package com.cfs.MovieAPI.controller;

import com.cfs.MovieAPI.entity.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private Map<Long, Movie> movieDB=new HashMap<>();

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(new ArrayList<>(movieDB.values()));
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie newMovie){
        movieDB.put(newMovie.getId(),newMovie);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMovie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> fetchMovie(@PathVariable long id){
        Movie existing=movieDB.get(id);
        if (existing==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.ok(existing);
    }

    @PutMapping("/editMovie/{id}")
    public ResponseEntity<Void> editMovie(@PathVariable long id,@RequestBody Movie movie){
        Movie existing=movieDB.get(id);
        if (existing==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        movieDB.put(id,movie);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteMovie/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable long id){
        Movie existing=movieDB.get(id);
        if (existing==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        movieDB.remove(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/movieSearch")
    public ResponseEntity<List <Movie>> searchMovie( ){
        List<Movie> movieList=new ArrayList<>();
        for(Movie movie:movieDB.values()){
            if (movie.getReleaseYear()==2023 && movie.getGenre().equalsIgnoreCase("action")){
                movieList.add(movie);
            }
        }
        return ResponseEntity.ok(movieList);
    }
}
