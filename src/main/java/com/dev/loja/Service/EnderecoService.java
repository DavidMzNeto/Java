package com.dev.loja.Service;

import com.dev.loja.model.EnderecoModel;
import com.dev.loja.Repositorio.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<EnderecoModel> findAll() {
        return enderecoRepository.findAll();
    }

    public Optional<EnderecoModel> findById(Long id) {
        return enderecoRepository.findById(id);
    }

    public EnderecoModel save(EnderecoModel endereco) {
        return enderecoRepository.save(endereco);
    }

    public void deleteById(Long id) {
        enderecoRepository.deleteById(id);
    }
}
