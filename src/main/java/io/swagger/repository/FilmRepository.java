package io.swagger.repository;

import io.swagger.model.Film;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//FilmRepository is interface that allows connection with mongoDB
@Repository
public interface FilmRepository extends MongoRepository<Film, Integer> {
    // MongoRepository has already implemented CRUD method
}
