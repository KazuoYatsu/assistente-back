package com.example.assistente.controller;

import com.example.assistente.model.dto.ResultadoDTO;
import com.example.assistente.service.ResultadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@CrossOrigin
@RequestMapping(value = "/api/resolutado")
public class ResultadoController {
    @Autowired
    ResultadoService resultadoService;

    @GetMapping
    List<ResultadoDTO> obterResultado(@RequestParam(name = "idPaciente") int id) {
        return resultadoService.obterResultado(id);
    }
}
