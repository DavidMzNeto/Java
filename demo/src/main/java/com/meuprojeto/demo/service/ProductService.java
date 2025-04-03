package com.meuprojeto.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.meuprojeto.demo.model.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    //GET : Retorna todos os produtos
    public List<Product> getAllProducts(){
        return products;
    }

    //POST: Adiciona um novo produto
    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }
}
