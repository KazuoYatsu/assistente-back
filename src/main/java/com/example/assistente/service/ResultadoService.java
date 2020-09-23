package com.example.assistente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoService {
    @Autowired
    ExameService exameService;
}
