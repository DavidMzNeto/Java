package com.dev.loja.controle.Produtos.Repositorio;

import com.dev.loja.controle.Produtos.Controle.produtosController.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

    List<Produto> findByNomeContaining(String nome);
    Optional<Produto> findOne(long id);
}