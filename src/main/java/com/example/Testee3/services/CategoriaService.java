package com.example.Testee3.services;

import com.example.Testee3.entities.Categoria;
import java.util.List;

public interface CategoriaService {

    Categoria criar(Categoria categoria);

    List<Categoria> pegarTudo();
}