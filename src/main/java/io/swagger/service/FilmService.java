package io.swagger.service;

import io.swagger.model.Film;
import io.swagger.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Optional<Film> getFilmById(Integer id) {
        return filmRepository.findById(id);
    }

    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }

    public void updateFilm(Integer id, Film film) {
        if (filmRepository.existsById(id)) {
            film.setId(id);  // Assicura che l'ID resti lo stesso
            filmRepository.save(film);
        }
    }

    public void deleteFilm(Integer id) {
        filmRepository.deleteById(id);
    }
}
