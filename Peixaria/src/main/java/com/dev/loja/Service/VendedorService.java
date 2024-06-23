package com.dev.loja.Service;

import com.dev.loja.model.VendedorModel;
import com.dev.loja.Repositorio.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public List<VendedorModel> findAll() {
        return vendedorRepository.findAll();
    }

    public Optional<VendedorModel> findById(Long id) {
        return vendedorRepository.findById(id);
    }

    public VendedorModel save(VendedorModel vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public void deleteById(Long id) {
        vendedorRepository.deleteById(id);
    }
}
