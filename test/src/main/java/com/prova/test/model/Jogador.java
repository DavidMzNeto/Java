 package com.prova.test.model;

import java.sql.Time;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
 public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int Age;
    
    @ManyToOne
    @JoinColumn(name = "time_id")
    private Time time;
}