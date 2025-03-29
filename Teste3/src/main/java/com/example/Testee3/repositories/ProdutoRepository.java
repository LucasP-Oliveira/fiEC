package com.example.Testee3.repositories;

import com.example.Testee3.entities.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
