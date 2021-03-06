package com.example.assistente.model.dto;

import com.example.assistente.model.type.TiposExames;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultadoDTO {
    private TiposExames tipoExame;
	private String mensagem;
    private List<Double> values;
    private Enum status;
    private double value;
    private boolean maiorMelhor;
    private boolean intervalo;
    
    public TiposExames getTipoExame() {
		this.maiorMelhor = tipoExame.isMaiorMelhor();
		this.intervalo = tipoExame.isIntervalo();
		return this.tipoExame;
	}
}
