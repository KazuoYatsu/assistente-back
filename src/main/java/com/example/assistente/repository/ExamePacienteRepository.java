package com.example.assistente.repository;

import com.example.assistente.model.entity.ExamePacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamePacienteRepository extends JpaRepository<ExamePacienteEntity, Integer> {
    List<ExamePacienteEntity> findByIdPaciente(int idPaciente);
}
