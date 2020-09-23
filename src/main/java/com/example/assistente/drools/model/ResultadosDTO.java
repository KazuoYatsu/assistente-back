package com.example.assistente.drools.model;

import com.example.assistente.model.dto.ResultadoDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ResultadosDTO {
    private List<ResultadoDTO> resultados;
}
