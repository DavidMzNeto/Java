package com.dev.loja.Service;

import org.springframework.stereotype.Service;
import com.dev.loja.model.ProdutoModel;
import com.dev.loja.model.ItemVendas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class carrinhoService {
    private List<ItemVendas> itensCarrinho = new ArrayList<>();

    public void adicionarProduto(ProdutoModel produto) {
        for (ItemVendas item : itensCarrinho) {
            if (item.getProduto().getId().equals(produto.getId())) {
                item.setQuantidade(item.getQuantidade() + 1);
                return;
            }
        }
        itensCarrinho.add(new ItemVendas(produto, 1));
    }

    public void removerProduto(Long produtoId) {
        itensCarrinho.removeIf(item -> item.getProduto().getId().equals(produtoId));
    }

    public List<ItemVendas> getItensCarrinho() {
        return new ArrayList<>(itensCarrinho); // Retorna uma cópia para evitar modificações externas
    }

    public BigDecimal getTotal() {
        return itensCarrinho.stream()
                .map(ItemVendas::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
