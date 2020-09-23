package com.example.assistente.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.assistente.model.type.TiposExames;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "exame_paciente")
public class ExamePacienteEntity {
	@Id
	@Column
	private int id;

	@Column
	private int idPaciente;

	@Column
	private TiposExames tipoExame;

	@Column
	private double value;
}
