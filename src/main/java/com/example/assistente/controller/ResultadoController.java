package com.example.assistente.controller;

import com.example.assistente.model.dto.ResultadoDTO;
import com.example.assistente.service.ResultadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@ResponseBody
@RequestMapping(value = "/api/resultado")
public class ResultadoController {
    @Autowired
    ResultadoService resultadoService;

    @GetMapping
    List<ResultadoDTO> obterResultado(@RequestParam(name = "idPaciente") int id) {
        return resultadoService.obterResultado(id);
    }
}
