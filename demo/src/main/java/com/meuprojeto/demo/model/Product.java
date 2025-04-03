package com.meuprojeto.demo.model;

public class Product {
    private Long id;
    private String name;
}
    //contrutor vazio
    public Product() {}
//Construtor com campos
    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }
//Getter e Setters
    public Long getId(){return id; }
    public void setId(Long id) {this.id = id;}
    public String getName(){return name; }
    public void getName(Long name) {this.name = name;}
    
