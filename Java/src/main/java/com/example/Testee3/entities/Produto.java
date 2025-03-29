package com.example.Testee3.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.Map;

@Setter
@Getter
@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;
    private String nome;
    private String descricao;
    private Date validade;
    private String imagem;
    private Map<String, Object> atributos;
    private String fornecedorId;

    private String categoriaId;

    public Produto(String id, String nome, String descricao, Date validade, String imagem, Map<String, Object> atributos, String fornecedorId, String categoriaId) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.validade = validade;
        this.imagem = imagem;
        this.atributos = atributos;
        this.fornecedorId = fornecedorId;
        this.categoriaId = categoriaId;
    }
// Construtores, getters e setters
}