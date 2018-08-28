package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmServiceImp implements FilmService {

    @Autowired
    private FilmRepository filmRepository;

    @Override
    @Transactional(readOnly = true)
    public Film getFilmById(long id) {
        return filmRepository.findById(id);
    }


    @Override
    @Transactional
    public void addFilm(Film film) {
        filmRepository.save(film);
    }

    @Override
    @Transactional
    public void updateFilm(Film film) {
        filmRepository.save(film);
    }
}
