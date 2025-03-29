package com.example.Testee3.DTOS;

public class CategoriaDTO {

    private String id;
    private String tipo;
    private String nome;

    // Construtores, getters e setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaDTO(String tipo, String nome, String id) {
        this.tipo = tipo;
        this.nome = nome;
        this.id = id;
    }
}
