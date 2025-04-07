package exam.service.serviceImpl;

import exam.database.Database;
import exam.models.Movie;
import exam.service.MovieService;

import java.util.Arrays;

public class MovieServiceImpl implements MovieService {
    int count = 0;
    @Override
    public String createMovie(Movie movie) {
        try{
            Database.movies[count++] = movie;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return "";
    }

    @Override
    public Movie getMovieById(long id) {
        try{
            for (Movie movie : Database.movies){
                if (movie.id() == id){
                    return movie;
                }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Movie[] getAllMovies() {
        try{
           return Database.movies;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String updateMovie(long id, Movie movie) {
        try {
            for (int i = 0; i < Database.movies.length; i++) {
                if (Database.movies[i].id() == id){
                    Database.movies[i].setName(movie.name());
                    Database.movies[i].setDirector(movie.director());
                    Database.movies[i].setCountry(movie.country());
                    return "Success!";
                }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        return "";
    }

    @Override
    public void deleteMovieBiId(long id) {
        try {
            int count = -1;
            for (int i = 0; i < Database.movies.length; i++) {
                if (Database.movies[i].id() == id) {
                    count = i;
                    break;
                }
            }

            if (count == -1) {
                System.out.println("Movie not fount!");
            }
            Movie[] newMovies = new Movie[Database.movies.length - 1];
            for (int i = 0, j = 0; i < Database.movies.length; i++) {
                if (i != count) {
                    newMovies[j++] = Database.movies[i];
                }
            }

            Database.movies = newMovies;
            System.out.println("Success!");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
