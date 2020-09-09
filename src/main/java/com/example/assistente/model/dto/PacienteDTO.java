package com.example.assistente.model.dto;

import java.util.Date;

import com.example.assistente.model.type.SexoPaciente;

public class PacienteDTO {
	
	private int id;	
	private SexoPaciente sexo;
	private Date dataNasc;
	
	public SexoPaciente getSexo() {
		return sexo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setSexo(SexoPaciente sexo) {
		this.sexo = sexo;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
}
