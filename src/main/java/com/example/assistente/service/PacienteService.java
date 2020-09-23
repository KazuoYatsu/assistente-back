package com.example.assistente.service;

import com.example.assistente.model.dto.PacienteDTO;
import com.example.assistente.model.entity.PacienteEntity;
import com.example.assistente.repository.PacienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    public PacienteDTO obterPaciente(int id){
        var paciente = pacienteRepository.findById(id);

        if(paciente.isPresent()) {
            var mapper = new ModelMapper();
            return mapper.map(paciente.get(), PacienteDTO.class);
        }

        return null;
    }

    public PacienteDTO incluirPaciente(PacienteDTO paciente) {
        var mapper = new ModelMapper();
        var pacienteEntity = mapper.map(paciente, PacienteEntity.class);
        return mapper.map(pacienteRepository.save(pacienteEntity), PacienteDTO.class);
    }
}
