package com.example.assistente.model.type;

import lombok.Getter;

@Getter
public enum TiposExames {
	// celulas vermelhas
	hemacias(true, false),
	hemoglobina(true, false),
	
	// celulas brancas
	leucocitos(true, false),
	batonete(true, false),
	seguimentados(true, false),
	linfocitos(true, false),
	monocitos(true, false),
	eosinofilos(true, false),
	basofilos(true, false),
	
	plaquetas(true, false),
	ttpa_tp(true, false),
	hdl(true, false),
	ldl(true, false),
	triglicerideos(true, false),
	ureia_creatinina(true, false),
	glicose(true, false),
	tgo_tgp(true, false),
	eletrolitos(true, false),
	tsh_t4_livre(true, false),
	acido_urico(true, false),
	pcr(true, false),
	psa(true, false),
	vhs(true, false),
	albumina(true, false);
	
	
	private final boolean intervalo;
	private final boolean maiorMelhor;
	private final boolean custom;
	
	private TiposExames(boolean intervalo, boolean maiorMelhor) {
		this(intervalo, maiorMelhor, false);
	}
	
	private TiposExames(boolean intervalo, boolean maiorMelhor, boolean custom) {
		this.intervalo = intervalo;
		this.maiorMelhor = maiorMelhor;
		this.custom = custom;
	}
}
