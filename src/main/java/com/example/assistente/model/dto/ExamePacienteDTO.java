package com.example.assistente.model.dto;

import java.util.List;

import com.example.assistente.model.type.Status;
import com.example.assistente.model.type.TiposExames;

public class ExamePacienteDTO {
	private TiposExames tipoExame;
	private String mensagem;
	private List<Double> values;
	private Status status;
	private double value;
	
	public TiposExames getTipoExame() {
		return tipoExame;
	}
	public void setTipoExame(TiposExames tipoExame) {
		this.tipoExame = tipoExame;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public List<Double> getValues() {
		return values;
	}
	public void setValues(List<Double> values) {
		this.values = values;
	}
	public Status getStatus() {
		return status;
	}
	public void setValue(Status status) {
		this.status = status;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}
