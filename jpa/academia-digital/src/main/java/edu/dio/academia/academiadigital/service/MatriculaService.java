package edu.dio.academia.academiadigital.service;

import edu.dio.academia.academiadigital.entity.Matricula;
import edu.dio.academia.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface MatriculaService {

    /**
     *
     * @param form - formulário referente aos dados para criação da Matrícula no banco de dados.
     * @return - Matrícula recém-criada.
     */
    Matricula create(MatriculaForm form);

    /**
     *
     * @param id - id da Matricula que será exibida.
     * @return - Matricula de acordo com o Id fornecido
     */
    Matricula get(Long id);

    /**
     *
     * @return - uma lista com todas as Matriculas que estão salvas no DB
     */
    List<Matricula> getAll(String bairro);

    /**
     *
     * @param id - id da Matricula que será removida.
     */
    void delete(Long id);
}
