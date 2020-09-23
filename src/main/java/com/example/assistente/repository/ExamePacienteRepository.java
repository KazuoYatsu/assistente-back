package com.example.assistente.repository;

import com.example.assistente.model.entity.ExamePacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExamePacienteRepository extends JpaRepository<ExamePacienteEntity, Integer> {
    Optional<List<ExamePacienteEntity>> findByIdPaciente(int idPaciente);
}
