package exam.models;

import exam.enams.Genre;

import java.time.LocalDate;

public class Movie {
    private long id;
    private String name;
    private String director;
    private String country;
    private LocalDate releaseDate;
    private Genre genre;

    public Movie() {
    }

    public Movie(long id, String name, String director, String country,
                 LocalDate releaseDate, Genre genre) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.country = country;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String director() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String country() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate releaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Genre genre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", country='" + country + '\'' +
                ", releaseDate=" + releaseDate +
                ", genre=" + genre +
                '}';
    }
}
