package com.example.Testee3.impl;

import com.example.Testee3.entities.Produto;
import com.example.Testee3.repositories.ProdutoRepository;
import com.example.Testee3.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto criar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> pegarTudo() {
        return produtoRepository.findAll();
    }
}