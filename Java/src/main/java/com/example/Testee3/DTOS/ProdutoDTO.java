package com.example.Testee3.DTOS;

import java.util.Date;
import java.util.Map;

public class ProdutoDTO {

    private String id;
    private String nome;
    private String descricao;
    private Date validade;
    private String imagem;
    private Map<String, Object> atributos;
    private String fornecedorId;
    private String categoriaId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Map<String, Object> getAtributos() {
        return atributos;
    }

    public void setAtributos(Map<String, Object> atributos) {
        this.atributos = atributos;
    }

    public String getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(String fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    public ProdutoDTO(String id, String nome, String descricao, Date validade, String imagem, Map<String, Object> atributos, String fornecedorId, String categoriaId) {
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