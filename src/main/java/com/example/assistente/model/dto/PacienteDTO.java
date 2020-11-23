package com.example.assistente.model.dto;

import java.time.LocalDate;
import java.time.Period;

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
	private Integer idade;
	
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
		this.idade = Period.between(dataNasc, LocalDate.now()).getYears();
	}
}
