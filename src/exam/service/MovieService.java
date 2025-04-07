package exam.service;

import exam.models.Movie;

public interface MovieService {
    String createMovie(Movie movie);
    Movie getMovieById(long id);
    Movie[] getAllMovies();
    String updateMovie(long id, Movie movie);
    void deleteMovieBiId(long id);
}
