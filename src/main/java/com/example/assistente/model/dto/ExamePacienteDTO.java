package com.example.assistente.model.dto;

import com.example.assistente.model.type.TiposExames;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ExamePacienteDTO {
	private int id;
	private int idPaciente;
	private TiposExames tipoExame;
	private double value;
}
