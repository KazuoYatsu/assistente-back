package com.example.assistente.controller;

import com.example.assistente.model.dto.ExamePacienteDTO;
import com.example.assistente.service.ExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping(value = "/api/exame")
public class ExameController {

    @Autowired
    private ExameService exameService;

    @PostMapping()
    public List<ExamePacienteDTO> incluirExames(
            @RequestBody List<ExamePacienteDTO> exames,
            @RequestAttribute(name = "pacienteId") int pacienteId) {
        return exameService.incluirExames(exames, pacienteId);
    }

    @GetMapping()
    public List<ExamePacienteDTO> obterExame(
            @RequestAttribute(name = "pacienteId") int pacienteId) {
        return exameService.listarExames(pacienteId);
    }
}
