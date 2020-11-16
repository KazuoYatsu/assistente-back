package com.example.assistente.service;

import com.example.assistente.model.dto.ExamePacienteDTO;
import com.example.assistente.model.entity.ExamePacienteEntity;
import com.example.assistente.repository.ExamePacienteRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExameService {
    @Autowired
    ExamePacienteRepository examePacienteRepository;

    public List<ExamePacienteDTO> listarExames(int idPaciente) {
        var pacientes = examePacienteRepository.findByIdPaciente(idPaciente);

        if(pacientes.isPresent()) {
            var mapper = new ModelMapper();
            return mapper.map(pacientes.get(), new TypeToken<List<ExamePacienteDTO>>() {}.getType());
        }

        return null;
    }

    public List<ExamePacienteDTO> incluirExames(List<ExamePacienteDTO> exames) {
        var modelMapper = new ModelMapper();

        var examesMapper = modelMapper.typeMap(ExamePacienteDTO.class, ExamePacienteEntity.class);

        var examesEntity = exames.stream().map(examesMapper::map).collect(Collectors.toList());

        return modelMapper.map(examePacienteRepository.saveAll(examesEntity), new TypeToken<List<ExamePacienteDTO>>() {}.getType());
    }
}
