package com.example.assistente.model.dto;

import com.example.assistente.model.type.SexoPaciente;
import com.example.assistente.model.type.Status;
import com.example.assistente.model.type.TiposExames;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultadoDTO {
    private TiposExames tipoExame;
    private SexoPaciente sexo;
    private String mensagem;
    private List<Double> values;
    private Status status;
    private double value;
}
