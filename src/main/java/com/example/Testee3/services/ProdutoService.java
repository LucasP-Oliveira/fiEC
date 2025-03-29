package com.example.Testee3.services;

import com.example.Testee3.entities.Produto;
import java.util.List;

public interface ProdutoService {

    Produto criar(Produto produto);

    List<Produto> pegarTudo();
}