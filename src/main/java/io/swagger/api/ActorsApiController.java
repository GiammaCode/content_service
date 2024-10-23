package io.swagger.api;

import io.swagger.model.Actor;
import io.swagger.model.Film;
import io.swagger.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ActorsApiController implements ActorsApi {

    private final ActorService actorService;

    @Autowired
    public ActorsApiController(ActorService actorService) {
        this.actorService = actorService;
    }

    //delete an actor entity
    @Override
    public ResponseEntity<Void> actorsActorIdDelete(Integer actorId) {
        actorService.deleteActor(actorId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //add new actor
    @Override
    public ResponseEntity<Actor> createActor(@Valid Actor body) {
        actorService.addActor(body);
        return null;
    }

    @Override
    public ResponseEntity<Actor> getActorById(Integer actorId) {
        Optional<Actor> actor = actorService.getActorById(actorId);
        return actor.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //get all actors
    @Override
    public ResponseEntity<List<Actor>> getActors() {
        List<Actor> actors = actorService.getAllActor();
        return new ResponseEntity<>(actors, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Film>> getFilmsByActor(Integer actorId) {
        List<Film> films = actorService.getFilmsByActor(actorId);
        return new ResponseEntity<>(films, HttpStatus.OK);
    }

    //update actor
    @Override
    public ResponseEntity<Actor> updateActor(Integer actorId, Actor body) {
        actorService.updateActor(actorId, body);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
