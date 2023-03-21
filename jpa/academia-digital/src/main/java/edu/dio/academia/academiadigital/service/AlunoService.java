package edu.dio.academia.academiadigital.service;

import edu.dio.academia.academiadigital.entity.Aluno;
import edu.dio.academia.academiadigital.entity.AvaliacaoFisica;
import edu.dio.academia.academiadigital.entity.form.AlunoForm;
import edu.dio.academia.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface AlunoService {

    /**
     *
     * @param form - formulario referente aos dados para criação do Aluno no banco de dados
     * @return - retorna Aluno recém-criado.
     */
    Aluno create(AlunoForm form);

    /**
     *
     * @param id - id do Aluno que será exibido
     * @return - retorna o Aluno com id fornecido.
     */
    Aluno get(Long id);

    /**
     *
     * @return - retorna uma lista contendo todos os Alunos cadastrados no banco de dados.
     */
    List<Aluno> getAll(String dataDeNascimento);

    /**
     *
     * @param id - id do Aluno que será atualizado
     * @param formUpdate - formulario contendo os valores atualizados
     * @return - retorna o Aluno atualizado.
     */

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    /**
     *
     * @param id - id do Aluno que será deletado.
     */
    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id);

}
