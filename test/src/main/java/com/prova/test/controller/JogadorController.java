package com.prova.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.prova.test.model.Jogador;
import com.prova.test.service.JogadorService;

@RestController
@RequestMapping("/Jogador")
public class JogadorController {
    // Implementação do controlador para Jogador
    
    // Exemplo: criar, ler, atualizar e excluir jogadores
    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public List<Jogador> listAll() {
        return jogadorService.listAll();
    }
    @GetMapping("/{id}")
    public Jogador findById(@PathVariable Long id) {
        return jogadorService.findById(id);
    }
    @PostMapping
    public Jogador BID(@RequestBody Jogador jogador) {
        return jogadorService.createJogador(jogador);
    }
    @PutMapping("/{id}")
    public Jogador update(@RequestBody Jogador jogador, @PathVariable Long id) {
        return jogadorService.updateJogador(jogador, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        jogadorService.delete(id);
    }
}
