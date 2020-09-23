package com.example.assistente.drools.model;

import com.example.assistente.model.dto.ExamePacienteDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ExamesDTO {
    private List<ExamePacienteDTO> exames;
}
