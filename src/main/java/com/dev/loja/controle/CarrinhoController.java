package com.dev.loja.controller;

import com.dev.loja.model.ProdutoModel;
import com.dev.loja.model.ItemVendas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.math.BigDecimal;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private com.dev.loja.Service.carrinhoService carrinhoService;

    @PostMapping("/adicionar")
    public ResponseEntity<Void> adicionarProduto(@RequestBody ProdutoModel produto) {
        carrinhoService.adicionarProduto(produto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/remover/{produtoId}")
    public ResponseEntity<Void> removerProduto(@PathVariable Long produtoId) {
        carrinhoService.removerProduto(produtoId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/itens")
    public ResponseEntity<List<ItemVendas>> getItensCarrinho() {
        return ResponseEntity.ok(carrinhoService.getItensCarrinho());
    }

    @GetMapping("/total")
    public ResponseEntity<BigDecimal> getTotal() {
        return ResponseEntity.ok(carrinhoService.getTotal());
    }
}
