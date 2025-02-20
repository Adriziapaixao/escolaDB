package com.example.escolaDB.controller;

import com.example.escolaDB.model.AlunoModel;
import com.example.escolaDB.repository.AlunoRepository;
import com.example.escolaDB.service.AlunosService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final AlunoRepository alunoRepository;
    private final AlunosService alunosService;

    public AlunoController(AlunoRepository alunoRepository, AlunosService alunosService) {
        this.alunoRepository = alunoRepository;
        this.alunosService = alunosService;
    }

    @GetMapping
    public List<AlunoModel> listarTodos() {
        return alunoRepository.findAll();

    }
}
