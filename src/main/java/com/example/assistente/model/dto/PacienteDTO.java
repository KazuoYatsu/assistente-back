package com.example.assistente.model.dto;

import java.time.LocalDate;

import com.example.assistente.model.type.SexoPaciente;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PacienteDTO {
	private int id;
	private String nome;
	private SexoPaciente sexo;
	private LocalDate dataNasc;
}
