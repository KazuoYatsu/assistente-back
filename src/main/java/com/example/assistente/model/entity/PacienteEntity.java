package com.example.assistente.model.entity;

import com.example.assistente.model.type.SexoPaciente;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "paciente")
public class PacienteEntity {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String nome;

	@Column
	private SexoPaciente sexo;

	@Column
	private LocalDate dataNasc;
}
