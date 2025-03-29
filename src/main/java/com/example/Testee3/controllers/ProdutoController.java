package com.example.Testee3.controllers;

import com.example.Testee3.entities.Produto;
import com.example.Testee3.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService; // Alterado para usar a interface

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return produtoService.criar(produto);
    }

    @GetMapping
    public List<Produto> pegarTudo() {
        return produtoService.pegarTudo();
    }
}