package com.example.Testee3.controllers;

import com.example.Testee3.entities.Categoria;
import com.example.Testee3.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService; // Alterado para usar a interface

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria) {
        return categoriaService.criar(categoria);
    }

    @GetMapping
    public List<Categoria> pegarTudo() {
        return categoriaService.pegarTudo();
    }
}