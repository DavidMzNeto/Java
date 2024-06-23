package com.dev.loja.controle;

import com.dev.loja.dtos.VendedorRecordDto;
import com.dev.loja.model.VendedorModel;
import com.dev.loja.Service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @GetMapping
    public List<VendedorModel> findAll() {
        return vendedorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendedorModel> findById(@PathVariable Long id) {
        Optional<VendedorModel> vendedor = vendedorService.findById(id);
        if (vendedor.isPresent()) {
            return new ResponseEntity<>(vendedor.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<VendedorModel> save(@RequestBody VendedorRecordDto vendedorDto) {
        VendedorModel vendedor = new VendedorModel();
        vendedor.setNome(vendedorDto.nome());
        vendedor.setCpf(vendedorDto.cpf());
        vendedor.setTelefone(vendedorDto.telefone());
        vendedor.setEmail(vendedorDto.email());
        vendedor.setDataNascimento(vendedorDto.dataNascimento());
        vendedor.setSexo(vendedorDto.sexo().charAt(0));
        vendedor.setSalario(vendedorDto.salario());
        // Assume that EnderecoModel is already fetched and set
        return new ResponseEntity<>(vendedorService.save(vendedor), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VendedorModel> update(@PathVariable Long id, @RequestBody VendedorRecordDto vendedorDto) {
        Optional<VendedorModel> existingVendedor = vendedorService.findById(id);
        if (existingVendedor.isPresent()) {
            VendedorModel vendedor = existingVendedor.get();
            vendedor.setNome(vendedorDto.nome());
            vendedor.setCpf(vendedorDto.cpf());
            vendedor.setTelefone(vendedorDto.telefone());
            vendedor.setEmail(vendedorDto.email());
            vendedor.setDataNascimento(vendedorDto.dataNascimento());
            vendedor.setSexo(vendedorDto.sexo().charAt(0));
            vendedor.setSalario(vendedorDto.salario());
            // Assume that EnderecoModel is already fetched and set
            return new ResponseEntity<>(vendedorService.save(vendedor), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (vendedorService.findById(id).isPresent()) {
            vendedorService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
