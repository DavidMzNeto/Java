package com.dev.loja.Service;

import com.dev.loja.model.ProdutoModel;
import com.dev.loja.Repositorio.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> findById(Long id) {
        return produtoRepository.findById(id);
    }

    public ProdutoModel save(ProdutoModel produto) {
        return produtoRepository.save(produto);
    }

    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }
}