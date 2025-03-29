package com.example.Testee3.repositories;

import com.example.Testee3.entities.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, String> {
}
