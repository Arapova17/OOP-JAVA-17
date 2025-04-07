package exam;

import exam.database.Database;
import exam.enams.Genre;
import exam.models.Movie;
import exam.service.MovieService;
import exam.service.serviceImpl.MovieServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MovieService movieService = new MovieServiceImpl();
        movieService.createMovie(new Movie(1, "Cat", "Ali", "Kyrgyz",
                LocalDate.of(2000, 2, 1), Genre.COMEDY));
        movieService.createMovie(new Movie(2, "Dog", "Ali", "Kyrgyz",
                LocalDate.of(2002, 8, 5), Genre.FANTASY));
        System.out.println(Arrays.toString(Database.movies));

        System.out.println(movieService.getMovieById(1));
        System.out.println("\nGet Movie: " + Arrays.toString(Database.movies));

        System.out.println("\nGet All Movie: " + Arrays.toString(movieService.getAllMovies()));

        System.out.println("\nUpdate Movie: " + movieService.updateMovie(1,
                new Movie(1, "House", "Anna", "USA",
                LocalDate.of(2008, 4, 5), Genre.ACTION)));
        System.out.println(Arrays.toString(movieService.getAllMovies()));

        movieService.deleteMovieBiId(1);
        System.out.println(Arrays.toString(movieService.getAllMovies()));

    }
}
