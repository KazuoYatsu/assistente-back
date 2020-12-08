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
			false, 
			false,
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
			false, 
			false,
			 "O nível está ideal",
			 "Recomendamos a ida ao médico, o nivel está acima"
	),
	basofilos(
			false, 
			false,
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
	
	pcr(
			false,
			false,
			"O nível de PCR está dentro do intervalo",
			"O PCR está alto, é possivel que haja algum processo de infecção"
			),
	
	psa(
			false, 
			false,
			"O nível de PSA está dentro do intervalo",
			"O PSA está alto, é recomendado ida ao urologista para avaliar se alteração de PSA é por causa benigna ou maligna"
			),
	
	vhs(
			false, 
			false,
			"O nível de VHS está dentro do intervalo",
			"O VHS está alto, é exigido atenção para algum processo infeccioso"
			),
	
	triglicerideos(
			false, 
			false,
			"O nível de triglicerídeos está dentro do intervalo",
			"Os triglicerideos estão elevados, a longo prazo podem causar doenças. Niveis elevados de triglicerideos podem ser causados também por diabete."
			),
	
	glicose(
			false, 
			false,
			true,
			"O nível de glicose está normal.",
			"O nível de glicose é condizente com pé diabetes, é necessário o controle da injestão de caboidratos e alcool.",
			"Caso seja a segunda vez que esteja obtendo este resultado, o paciente é caracteriado como diabético, sua dieta e tramento devem ser iniciadas."
			),
	
	hdl(
			false, 
			true,
			true,
			"O nível de HDL está baixo, é recomendado a injestão de peixes de águas profundas, azeite extra virgem, abacate, sementes como linhaça e chia, castanhas..."
			+ "Deve ser evitado o consumo de açucar refinado, frituras em excesso, carboidratos em excesso, gorduras trans e embutidos.",
			"O nível de colesterol está bom, porém pode melhorar com o consumo de peixes de águas profundas, azeite extra virgem, abacate, sementes como linhaça e chia, castanhas...",
			"O nível de colesterol está ideal."
			),
	
	ldl(
			false, 
			false,
			true,
			"O colesterol LDL está ótimo",
			"O colesterol LDL está dentro do classificado como desejável",
			"O colesterol LDL está dentro do classificado como limítrofe, é recomendada a redução e açucar e frituras e introdução de algum nível de atividade física",
			"O colesterol LDL está dentro do classificado como alto, é necessária a introdução de algum nível de atividade fisica na rotina, readequação da dieta "
			+ "substituindo açúcar por adoçantes, removendo frituras da dieta, regulando a quatidade de sal e injerindo a quantidade adequada de água até "
			+ "a consulta com um nutricionista para acompanhamento.",
			"O colesterol LDL está muito elevado, é necessário com urgência introdução de algum nível de atividade fisica na rotina, readequação da dieta "
			+ "substituindo açúcar por adoçantes, removendo frituras da dieta, regulando a quatidade de sal e injerindo a quantidade adequada de água até "
			+ "a consulta com um nutricionista para acompanhamento."
			);
	
	
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
