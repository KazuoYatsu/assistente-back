package com.example.assistente.model.dto;

import com.example.assistente.model.type.TiposExames;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamePacienteDTO {
	private int id;
	private int idPaciente;
	private TiposExames tipoExame;
	private double value;
	private boolean jejum;
}
