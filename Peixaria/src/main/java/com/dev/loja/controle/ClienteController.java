package com.dev.loja.controle;

import com.dev.loja.dtos.ClienteRecordDto;
import com.dev.loja.model.ClienteModel;
import com.dev.loja.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteModel> findAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> findById(@PathVariable Long id) {
        Optional<ClienteModel> cliente = clienteService.findById(id);
        if (cliente.isPresent()) {
            return new ResponseEntity<>(cliente.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ClienteModel> save(@RequestBody ClienteRecordDto clienteDto) {
        ClienteModel cliente = new ClienteModel();
        cliente.setNome(clienteDto.nome());
        cliente.setCpf(clienteDto.cpf());
        cliente.setTelefone(clienteDto.telefone());
        cliente.setEmail(clienteDto.email());
        cliente.setDataNascimento(clienteDto.dataNascimento());
        cliente.setSexo(clienteDto.sexo().charAt(0));
        // Assume that EnderecoModel is already fetched and set
        return new ResponseEntity<>(clienteService.save(cliente), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteModel> update(@PathVariable Long id, @RequestBody ClienteRecordDto clienteDto) {
        Optional<ClienteModel> existingCliente = clienteService.findById(id);
        if (existingCliente.isPresent()) {
            ClienteModel cliente = existingCliente.get();
            cliente.setNome(clienteDto.nome());
            cliente.setCpf(clienteDto.cpf());
            cliente.setTelefone(clienteDto.telefone());
            cliente.setEmail(clienteDto.email());
            cliente.setDataNascimento(clienteDto.dataNascimento());
            cliente.setSexo(clienteDto.sexo().charAt(0));
            // Assume that EnderecoModel is already fetched and set
            return new ResponseEntity<>(clienteService.save(cliente), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (clienteService.findById(id).isPresent()) {
            clienteService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
