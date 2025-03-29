package com.example.Testee3.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "fornecedores")
public class Fornecedor {

    @Id
    private String id;
    private String nome;
    private String cnpj;

    public Fornecedor(String id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }
// Construtores, getters e setters
}