package com.dev.loja.Repositorio;

import com.dev.loja.model.VendedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<VendedorModel, Long> {
}