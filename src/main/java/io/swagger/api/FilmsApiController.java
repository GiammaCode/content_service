package io.swagger.api;

import io.swagger.model.Film;
import io.swagger.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class FilmsApiController implements FilmsApi {

    private final FilmService filmService;

    @Autowired
    public FilmsApiController(FilmService filmService) {
        this.filmService = filmService;
    }

    // CREATE: Aggiungere un nuovo film
    @Override
    public ResponseEntity<Void> filmsPost(@Valid Film body) {
        filmService.addFilm(body);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // READ: Ottenere tutti i film
    @Override
    public ResponseEntity<List<Film>> filmsGet() {
        List<Film> films = filmService.getAllFilms();
        return new ResponseEntity<>(films, HttpStatus.OK);
    }

    // READ: Ottenere un film specifico per ID
    @Override
    public ResponseEntity<Film> filmsIdGet(Integer id) {
        Optional<Film> film = filmService.getFilmById(id);
        return film.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // UPDATE: Aggiornare un film esistente
    @Override
    public ResponseEntity<Void> filmsIdPut(Integer id, @Valid Film body) {
        filmService.updateFilm(id, body);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // DELETE: Eliminare un film per ID
    @Override
    public ResponseEntity<Void> filmsIdDelete(Integer id) {
        filmService.deleteFilm(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
