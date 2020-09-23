package com.example.assistente.model.dto;

import com.example.assistente.model.type.TiposExames;

public class ExamePacienteDTO {

	private int id;
	private int idPaciente;
	private TiposExames tipoExame;
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
