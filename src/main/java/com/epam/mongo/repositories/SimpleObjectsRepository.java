package com.epam.mongo.repositories;

import com.epam.mongo.model.SimpleObject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SimpleObjectsRepository extends MongoRepository<SimpleObject, String> {
    SimpleObject findByTitle(String title);
}
