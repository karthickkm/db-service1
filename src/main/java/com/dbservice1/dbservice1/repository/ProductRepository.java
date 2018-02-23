package com.dbservice1.dbservice1.repository;

import com.dbservice1.dbservice1.mongo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
