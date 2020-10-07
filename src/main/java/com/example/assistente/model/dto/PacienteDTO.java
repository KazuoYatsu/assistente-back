package com.example.assistente.model.dto;

import java.time.LocalDate;

import com.example.assistente.model.type.SexoPaciente;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PacienteDTO {
	private int id;
	private String nome;
	private SexoPaciente sexo;
	private LocalDate dataNasc;
	private int idade;
}
