package io.swagger.repository;

import io.swagger.model.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//ActorRepository allows connection with MongoDB
@Repository
public interface ActorRepository extends MongoRepository<Actor, Integer> {
        // MongoRepository has already implemented CRUD method
}
