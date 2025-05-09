package com.prova.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.prova.test.model.Jogador;
import com.prova.test.repository.JogadorRepository;

@Service
public class JogadorService {

    // Implementação do serviço JogadorService
    // Aqui você pode adicionar métodos para manipular jogadores, como criar, atualizar, excluir, etc.
    // Por exemplo:
    // public Jogador createJogador(Jogador jogador) {
    //     return jogadorRepository.save(jogador);
    // }
    @Autowired
    private JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<Jogador> listAll() {
        return jogadorRepository.findAll();
    }

    public Jogador findById(Long id) {
        return jogadorRepository.findById(id).orElse(null);
    }
    public Jogador createJogador(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }
    public Jogador updateJogador(@Validated Jogador novoJogador, Long id) {
        return jogadorRepository.findById(id).map(jogador -> {
            jogador.setName(novoJogador.getName());
            jogador.setAge(novoJogador.getAge());
            return jogadorRepository.save(jogador);
        }).orElseThrow();
    }
    public void delete(Long id) {
        jogadorRepository.deleteById(id);
    }


}
