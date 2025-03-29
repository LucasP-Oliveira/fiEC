package com.example.Testee3.impl;

import com.example.Testee3.entities.Fornecedor;
import com.example.Testee3.repositories.FornecedorRepository;
import com.example.Testee3.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FornecedorServiceImpl implements FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Override
    public Fornecedor criar(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @Override
    public List<Fornecedor> pegarTudo() {
        return fornecedorRepository.findAll();
    }
}