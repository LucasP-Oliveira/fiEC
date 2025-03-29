package com.example.Testee3.impl;

import com.example.Testee3.entities.Categoria;
import com.example.Testee3.repositories.CategoriaRepository;
import com.example.Testee3.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria criar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> pegarTudo() {
        return categoriaRepository.findAll();
    }
}