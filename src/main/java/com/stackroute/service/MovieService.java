package com.stackroute.service;

import com.stackroute.domain.Movie;
import com.stackroute.exception.MovieAlreadyExistsException;
import com.stackroute.exception.MovieNotFoundException;

import java.util.List;

public interface MovieService {
    public List<Movie> GetAllMovies() throws MovieNotFoundException;
    public Movie AddNewMovie(Movie newMovie) throws MovieAlreadyExistsException;
    public Movie GetParticularMovie(int movieId) throws MovieNotFoundException;
    public Movie UpdateMovie(Movie newMovie, int movieId) throws MovieNotFoundException;
    public void DeleteMovie(int movieId) throws MovieNotFoundException;
    public List<Movie> GetMovieByTitle(String movieTitle) throws MovieNotFoundException;
}
