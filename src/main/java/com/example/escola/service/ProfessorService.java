package com.example.escola.service;

import com.example.escola.model.Professor;
import com.example.escola.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> listarTodos() {
        return professorRepository.findAll();
    }

    public Professor salvar(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor buscarPorId(Long id) {
        return professorRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        professorRepository.deleteById(id);
    }
}