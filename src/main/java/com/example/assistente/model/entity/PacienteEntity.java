package com.example.assistente.model.entity;

import com.example.assistente.model.type.SexoPaciente;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name = "paciente")
public class PacienteEntity {
	@Id
	@Column
	private int id;
	
	@Column
	private String nome;

	@Column
	private SexoPaciente sexo;

	@Column
	private LocalDate dataNasc;
}
