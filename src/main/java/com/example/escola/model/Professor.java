package com.example.escola.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String materia;
}
