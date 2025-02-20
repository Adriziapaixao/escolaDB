package com.example.escolaDB.service;

import com.example.escolaDB.model.AlunoModel;
import com.example.escolaDB.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlunoServiceImpl {

    @Autowired
    private final AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<AlunoModel> listarTodosAlunos() {
        List<AlunoModel> aluno = alunoRepository.findAll();
        return aluno;
    }

}
