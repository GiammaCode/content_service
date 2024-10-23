package io.swagger.service;

import io.swagger.model.Actor;
import io.swagger.model.Film;
import io.swagger.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {
    private final ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> getAllActor() {
        return actorRepository.findAll();
    }

    public Optional<Actor> getActorById(Integer id) {
        return actorRepository.findById(id);
    }

    public Actor addActor(Actor actor) {
        return actorRepository.save(actor);
    }

    public void updateActor(Integer id, Actor actor) {
        if (actorRepository.existsById(id)) {
            actor.setId(id);  // Assicura che l'ID resti lo stesso
            actorRepository.save(actor);
        }
    }

    public void deleteActor(Integer id) {
        actorRepository.deleteById(id);
    }
    public List<Film> getFilmsByActor(Integer id){
        return actorRepository.findById(id).get().getFilms();
    }
}
