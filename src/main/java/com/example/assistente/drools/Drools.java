package com.example.assistente.drools;

import com.example.assistente.model.dto.ExamePacienteDTO;
import com.example.assistente.model.dto.PacienteDTO;
import com.example.assistente.model.dto.ResultadoDTO;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
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
        List<ResultadoDTO> resultado = new ArrayList<>();

        KieSession kieSession = kieContainer.newKieSession("rulesSession");

        kieSession.insert(paciente);
        kieSession.insert(resultado);
        kieSession.insert(exames);

        kieSession.fireAllRules();
        kieSession.dispose();

        return resultado;
    }
}
