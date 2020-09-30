package com.example.assistente.model.entity;

import javax.persistence.*;

import com.example.assistente.model.type.TiposExames;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exame_paciente")
public class ExamePacienteEntity {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column
	private int idPaciente;

	@Column
	private TiposExames tipoExame;

	@Column
	private double value;

	@Column
	private boolean jejum;
}
