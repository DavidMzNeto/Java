package com.dev.loja.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.loja.controle.produtosController.Produto;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

    List<Produto> findByNomeContaining(String nome);
    Optional<Produto> findOne(long id);
}