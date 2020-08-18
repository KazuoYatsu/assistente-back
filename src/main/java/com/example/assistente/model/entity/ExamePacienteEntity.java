package com.example.assistente.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.assistente.model.type.TiposExames;

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
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdPaciente() {
		return idPaciente;
	}
	
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public TiposExames getTipoExame() {
		return tipoExame;
	}
	
	public void setTipoExame(TiposExames tipoExame) {
		this.tipoExame = tipoExame;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
}
