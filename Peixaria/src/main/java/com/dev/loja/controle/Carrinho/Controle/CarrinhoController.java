package com.dev.loja.controle.Carrinho.Controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarrinhoController {

    @GetMapping("/carrinho")
    public String carrinho(Model model) {
        List<ItemVendas> itensCarrinho = new ArrayList<ItemVendas>();
        model.addAttribute("itensCarrinho", itensCarrinho);
        double subTotal = 0;
        double total = subTotal;
        model.addAttribute("subTotal", subTotal);
        model.addAttribute("total", total);
        return "carrinho";
    }
}


