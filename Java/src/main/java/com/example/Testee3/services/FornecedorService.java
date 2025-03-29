package com.example.Testee3.services;

import com.example.Testee3.entities.Fornecedor;
import java.util.List;

public interface FornecedorService {

    Fornecedor criar(Fornecedor fornecedor);

    List<Fornecedor> pegarTudo();
}