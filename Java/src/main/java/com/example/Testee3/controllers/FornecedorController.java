package com.example.Testee3.controllers;

import com.example.Testee3.entities.Fornecedor;
import com.example.Testee3.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService; // Alterado para usar a interface

    @PostMapping
    public Fornecedor criar(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.criar(fornecedor);
    }

    @GetMapping
    public List<Fornecedor> pegarTudo() {
        return fornecedorService.pegarTudo();
    }
}