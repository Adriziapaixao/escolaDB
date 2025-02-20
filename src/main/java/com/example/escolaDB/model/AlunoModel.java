package com.example.escolaDB.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@Table(name = "alunos")
@Entity
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String idade;

    @Column(name = "data_nascimento")
    private LocalDate nascimento;

    @Column(name = "serie_turma")
    private String serie;
}