package edu.dio.academia.academiadigital.service;

import edu.dio.academia.academiadigital.entity.AvaliacaoFisica;
import edu.dio.academia.academiadigital.entity.form.AvaliacaoFisicaForm;
import edu.dio.academia.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {
    /**
     *
     * @param form - formulario referente aos dados para criação da Avaliação Física no banco de dados
     * @return - Avaliação Física recém-criada.
     */
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    /**
     *
     * @param id - id da Avaliação Física que será exibida.
     * @return - Avaliação Física de acordo com o Id fornecido.
     */
    AvaliacaoFisica get(Long id);

    /**
     *
     * @return - uma lista com todas as Avaliações Físicas salvas no Banco de Dados.
     */
    List<AvaliacaoFisica> getAll();

    /**
     *
     * @param id - id da Avaliação Física que será atualizada.
     * @param formUpdate - formulario referente aos dados necessários para atualização da Avaliação Física no bando de dados.
     * @return - Avaliação Física recém-atualizada.
     */
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    /**
     *
     * @param id - id da Avaliação Física que será excluida.
     */
    void delete(Long id);
}
