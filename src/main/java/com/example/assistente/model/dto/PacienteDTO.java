package com.example.assistente.model.dto;

import com.example.assistente.model.type.SexoPaciente;

public class PacienteDTO {
	private SexoPaciente sexo;
	
	public SexoPaciente getSexo() {
		return sexo;
	}
	
	public void setSexo(SexoPaciente sexo) {
		this.sexo = sexo;
	}
}
