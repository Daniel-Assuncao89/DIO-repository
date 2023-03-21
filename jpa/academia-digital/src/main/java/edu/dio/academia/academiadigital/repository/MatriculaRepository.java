package edu.dio.academia.academiadigital.repository;

import edu.dio.academia.academiadigital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    /**
     *
     * @param bairro: referencia para o filtro
     * @return : lista de alunos matriculados que residem no bairro passado como parametro.
     */
    List<Matricula> findByAlunoBairro(String bairro);
}
