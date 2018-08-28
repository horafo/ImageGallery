package ua.kiev.prog;

public interface FilmService {
    Film getFilmById(long id);
    void addFilm(Film film);
    void updateFilm(Film film);
}

