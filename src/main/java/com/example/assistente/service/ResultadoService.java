package com.example.assistente.service;

import com.example.assistente.drools.Drools;
import com.example.assistente.model.dto.ResultadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultadoService {
    @Autowired
    ExameService exameService;

    @Autowired
    PacienteService pacienteService;

    @Autowired
    Drools drools;

    public List<ResultadoDTO> obterResultado(int idPaciente) {
        var examePaciente = exameService.listarExames(idPaciente);
        var paciente = pacienteService.obterPaciente(idPaciente);

        return drools.processarExames(examePaciente, paciente);
    }
}
