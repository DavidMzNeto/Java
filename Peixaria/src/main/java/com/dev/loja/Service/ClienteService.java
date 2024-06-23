package com.dev.loja.services;

import com.dev.loja.model.ClienteModel;
import com.dev.loja.model.EnderecoModel;
import com.dev.loja.Repositorio.ClienteRepository;
import com.dev.loja.Repositorio.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<ClienteModel> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> findById(Long id) {
        return clienteRepository.findById(id);
    }

    public ClienteModel save(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    public EnderecoModel findEnderecoById(Long enderecoId) {
        return enderecoRepository.findById(enderecoId).orElseThrow(() -> new RuntimeException("Endereco not found"));
    }
}
