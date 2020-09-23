package com.example.assistente.model.dto;

import com.example.assistente.model.type.Status;
import com.example.assistente.model.type.TiposExames;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ResultadoDTO {
    private TiposExames tipoExame;
    private String mensagem;
    private List<Double> values;
    private Status status;
    private double value;
}
