package com.example.assistente.controller;

import com.example.assistente.model.dto.PacienteDTO;
import com.example.assistente.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@CrossOrigin
@RequestMapping(value = "/api/paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @GetMapping
    public PacienteDTO obterPaciente(@RequestParam(name = "id") int id) {
        return pacienteService.obterPaciente(id);
    }

    @PostMapping
    public PacienteDTO incluirPaciente(@RequestBody PacienteDTO paciente) {
        return pacienteService.incluirPaciente(paciente);
    }
}
