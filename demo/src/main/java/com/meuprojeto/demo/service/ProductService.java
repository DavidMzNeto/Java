package com.meuprojeto.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.meuprojeto.demo.model.Product;

@Service
public class ProductService {
   @Autowired
   ProductRepository productRepository;

    //POST: Adiciona um novo produto
    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> update (Long id, Product updateProduct){
        return produtoRepository.findById(id).map(existingModel ->{
            existingModel.setName(updateProduct.getName());
            existingModel.setDescription(updateProduct.getDescription())/
        });

    public Product criar(@Valid Product product) {
        tarefa.setDataCriacao(java.time.LocalDateTime.now());
        return tarefaRepository.save(product);
    }

    public Optional<Product>  deleteById(Long id){
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
            return product;
        }
    }
    }
}
