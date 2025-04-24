package com.prova.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.prova.test.model.Jogador;
import com.prova.test.service.JogadorService;

public class JogadorController {
    // Implementação do controlador para Jogador
    
    // Exemplo: criar, ler, atualizar e excluir jogadores
    @Autowired
    private JogadorService jogadorService;

    @GetMapping("/Jogador")
    public List<Jogador> listAll() {
        return jogadorService.listAll();
    }
    @GetMapping("/Jogador/{id}")
    public Jogador findById(@PathVariable Long id) {
        return jogadorService.findById(id);
    }
    @GetMapping
    public Jogador BID(@RequestBody Jogador jogador) {
        return jogadorService.createJogador(jogador);
    }
}
