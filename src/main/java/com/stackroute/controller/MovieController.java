package com.stackroute.controller;

import com.stackroute.domain.Movie;
import com.stackroute.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private  MovieService movieService;
    @GetMapping("/")
    public List<Movie> GetAllMovies(){
        return movieService.GetAllMovies();
    }
    @PostMapping("/")
    public Movie addNewMovie(@RequestBody Movie newMovie){
        return movieService.AddNewMovie(newMovie);
    }
    @GetMapping("/{id}")
    public Movie getParticularMovie(@PathVariable int id){
        return movieService.GetParticularMovie(id);
    }
    @GetMapping("/movieName={movieTitle}")
    public List<Movie> getMoviesByTitle(@PathVariable String movieTitle){
        return movieService.GetMovieByTitle(movieTitle);
    }
    @PutMapping("/{id}")
    public Movie updateMovie(@RequestBody Movie newMovie, @PathVariable int id){
        return movieService.UpdateMovie(newMovie,id);
    }
    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable int id){
        movieService.DeleteMovie(id);
    }
}
