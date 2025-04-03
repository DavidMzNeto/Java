package com.meuprojeto.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuprojeto.demo.model.Product;
import com.meuprojeto.demo.service.ProductService;
@RestController
@RequestMapping("/api/crud")
public class ProductController {

    @Autowired
    private ProductService productService;
    //POST: Adiciona um novo produto


    @PostMapping("{id}")
    public ResponseEntity<Product> postProductById;
    // GET: Buscar produto pelo ID

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        return product.map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }
// PUT: Atualizar produto por ID
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct (PathVariable Long id, RequestBody Product updatedProduct){
        Optional<Product> product = productService.updateProduct(id, updatedProduct);
        return product.map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }
// DELETE: Deletar produto por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        boolean deleted = productService.deleteProduct(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
