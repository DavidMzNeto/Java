package com.dev.loja.controle.Carrinho.Controle;
import org.springframework.stereotype.Service;
import com.dev.loja.controle.Produtos.*;
import com.dev.loja.controle.Produtos.Controle.produtosController.Produto;

import java.util.ArrayList;
import java.util.List;
public class carrinhoService {

    private List<ItemVendas> itens;

@Service
public class CarrinhoService {
    private List<ItemVendas> itensCarrinho = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        for (ItemCarrinho item : itensCarrinho) {
            if (item.getProduto().getId().equals(produto.getid())) {
                item.setQuantidade(item.getQuantidade() + 1);
                return;
            }
        }
        itensCarrinho.add(new ItemCarrinho(produto, 1));
    }

    public void removerProduto(Long produtoId) {
        itensCarrinho.removeIf(item -> item.getProduto().getid().equals(produtoId));
    }

    public List<ItemCarrinho> getItensCarrinho() {
        return itensCarrinho;
    }

    public double getTotal() {
        return itens.stream().mapToDouble(item -> item.getProduto().getPreco() * item.getQuantidade()).sum();
    }
}

}

