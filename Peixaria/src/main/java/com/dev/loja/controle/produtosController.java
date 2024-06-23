package com.dev.loja.controle;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class produtosController {
@Entity(name="product")
@Table(name="product")
public class Produto implements Serializable{

    private static final long serialVersionUID = 1L;


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getid(){
        return id;
    }
    public void setid(int id){
         this.id = id;
    }

    @Column
    private String nome;
    @Column
    private double preco;
    @Column
    private int quantidade;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }
}
}
