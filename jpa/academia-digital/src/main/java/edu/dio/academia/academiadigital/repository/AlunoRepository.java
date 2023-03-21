package edu.dio.academia.academiadigital.repository;

import edu.dio.academia.academiadigital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    /**
     *
     * @param dataDeNascimento: data de nascimento dos alunos
     * @return - lista com todos os alunos que fazem aniversario na data passada
     */
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}
