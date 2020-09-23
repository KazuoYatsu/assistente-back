package com.example.assistente.controller;

import com.example.assistente.model.dto.ExamePacienteDTO;
import com.example.assistente.service.ExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping(value = "api/exame")
public class ExameController {

    @Autowired
    private ExameService exameService;

    @PostMapping()
    public List<ExamePacienteDTO> cadastrarExame(
            @RequestBody List<ExamePacienteDTO> exames,
            @RequestAttribute(name = "pacienteId", required = true) int pacienteId) {
        return null;
    }

    @GetMapping()
    public List<ExamePacienteDTO> obterExame(
            @RequestAttribute(name = "pacienteId", required = true) int pacienteId) {
        return null;
    }
}
