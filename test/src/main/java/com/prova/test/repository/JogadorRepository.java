package com.prova.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prova.test.model.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador,Long>{
    
}
