package com.dev.loja.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "item_vendas")
public class ItemVendas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private ProdutoModel produto;

    private int quantidade;

    public ItemVendas() {
    }

    public ItemVendas(ProdutoModel produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return produto.getPreco().multiply(BigDecimal.valueOf(quantidade));
    }
}
