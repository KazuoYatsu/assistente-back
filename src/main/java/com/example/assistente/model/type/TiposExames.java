package com.example.assistente.model.type;

import lombok.Getter;

@Getter
public enum TiposExames {
	// celulas vermelhas
	hemacias(
			true,
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	hemoglobina(
			true,
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	
	// celulas brancas
	leucocitos(
			true, 
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	bastonete(
			true, 
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	seguimentados(
			true, 
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	linfocitos(
			true, 
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	monocitos(
			true, 
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	eosinofilos(
			true, 
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	basofilos(
			true, 
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	
	plaquetas(
			true,
			false,
			 "Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	
	ttpa(
			true,
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	tp(
			true,
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	
	inrTp(
			true,
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	
	ureia_creatinina(
			true, 
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	
	tgp(
			true, 
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	tgo(
			true, 
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	tsh(
			true, 
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	
	t4_livre(
			true, 
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	
	acido_urico(
			true, 
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	
	albumina(
			true, 
			false,
			"Recomendamos a ida ao médico, o nível está abaixo",
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
			),
	
	pcr(false, false),
	psa(false, false),
	vhs(false, false),
	glicose(false, false),
	hdl(false, true),
	ldl(false, false),
	triglicerideos(false, false);
	
	
	private final boolean intervalo;
	private final boolean maiorMelhor;
	private final boolean custom;
	private final String[] mensagens;
	
	private TiposExames(boolean intervalo, boolean maiorMelhor, String... messages) {
		
		this(intervalo, maiorMelhor, false, messages);
	}
	
	private TiposExames(boolean intervalo, boolean maiorMelhor, boolean custom, String... messages) {
		this.intervalo = intervalo;
		this.maiorMelhor = maiorMelhor;
		this.custom = custom;
		this.mensagens = messages;
	}
}
