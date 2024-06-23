package com.dev.loja.controle;

import com.dev.loja.dtos.EnderecoRecordDto;
import com.dev.loja.model.EnderecoModel;
import com.dev.loja.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<EnderecoModel> findAll() {
        return enderecoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoModel> findById(@PathVariable Long id) {
        Optional<EnderecoModel> endereco = enderecoService.findById(id);
        if (endereco.isPresent()) {
            return new ResponseEntity<>(endereco.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<EnderecoModel> save(@RequestBody EnderecoRecordDto enderecoDto) {
        EnderecoModel endereco = new EnderecoModel();
        endereco.setRua(enderecoDto.rua());
        endereco.setBairro(enderecoDto.bairro());
        endereco.setNumero(enderecoDto.numero());
        endereco.setCidade(enderecoDto.cidade());
        endereco.setEstado(enderecoDto.estado());
        endereco.setCep(enderecoDto.cep());
        return new ResponseEntity<>(enderecoService.save(endereco), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnderecoModel> update(@PathVariable Long id, @RequestBody EnderecoRecordDto enderecoDto) {
        Optional<EnderecoModel> existingEndereco = enderecoService.findById(id);
        if (existingEndereco.isPresent()) {
            EnderecoModel endereco = existingEndereco.get();
            endereco.setRua(enderecoDto.rua());
            endereco.setBairro(enderecoDto.bairro());
            endereco.setNumero(enderecoDto.numero());
            endereco.setCidade(enderecoDto.cidade());
            endereco.setEstado(enderecoDto.estado());
            endereco.setCep(enderecoDto.cep());
            return new ResponseEntity<>(enderecoService.save(endereco), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (enderecoService.findById(id).isPresent()) {
            enderecoService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
