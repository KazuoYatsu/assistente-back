package com.example.assistente.drools;

import com.example.assistente.drools.model.ExamesDTO;
import com.example.assistente.drools.model.ResultadosDTO;
import com.example.assistente.model.dto.ExamePacienteDTO;
import com.example.assistente.model.dto.PacienteDTO;
import com.example.assistente.model.dto.ResultadoDTO;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Drools {
    private final KieContainer kieContainer;

    @Autowired
    public Drools(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public List<ResultadoDTO> processarExames(List<ExamePacienteDTO> exames, PacienteDTO paciente) {
        var resultados = new ArrayList<ResultadoDTO>();
        var resultadosDrools = ResultadosDTO.builder().resultados(resultados).build();
        var examesDrools = ExamesDTO.builder().exames(exames).build();

        var kieSession = kieContainer.newKieSession("rulesSession");

        kieSession.insert(paciente);
        kieSession.insert(resultadosDrools);
        kieSession.insert(examesDrools);

        kieSession.fireAllRules();
        kieSession.dispose();

        return resultados;
    }
}
