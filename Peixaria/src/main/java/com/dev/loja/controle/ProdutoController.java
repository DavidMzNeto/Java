package com.dev.loja.controle;

import com.dev.loja.dtos.ProdutosRecordDto;
import com.dev.loja.model.ProdutoModel;
import com.dev.loja.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll() {
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> findById(@PathVariable Long id) {
        Optional<ProdutoModel> produto = produtoService.findById(id);
        if (produto.isPresent()) {
            return new ResponseEntity<>(produto.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ProdutoModel> save(@RequestBody ProdutosRecordDto productDto) {
        ProdutoModel produto = new ProdutoModel();
        produto.setNome(productDto.name());
        produto.setPreco(productDto.value());
        produto.setQuantidade(productDto.quantidade());
        return new ResponseEntity<>(produtoService.save(produto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoModel> update(@PathVariable Long id, @RequestBody ProdutosRecordDto productDto) {
        Optional<ProdutoModel> existingProduto = produtoService.findById(id);
        if (existingProduto.isPresent()) {
            ProdutoModel produto = existingProduto.get();
            produto.setNome(productDto.name());
            produto.setPreco(productDto.value());
            produto.setQuantidade(productDto.quantidade());
            return new ResponseEntity<>(produtoService.save(produto), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (produtoService.findById(id).isPresent()) {
            produtoService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}