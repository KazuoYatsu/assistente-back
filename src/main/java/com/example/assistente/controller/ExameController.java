package com.example.assistente.controller;

import com.example.assistente.model.dto.ExamePacienteDTO;
import com.example.assistente.service.ExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping(value = "/api/exame")
public class ExameController {

    @Autowired
    private ExameService exameService;

    @PostMapping()
    public List<ExamePacienteDTO> incluirExames(
            @RequestBody List<ExamePacienteDTO> exames) {
        return exameService.incluirExames(exames);
    }

    @GetMapping()
    public List<ExamePacienteDTO> obterExame(
            @RequestParam(name = "idPaciente") int pacienteId) {
        return exameService.listarExames(pacienteId);
    }
}
