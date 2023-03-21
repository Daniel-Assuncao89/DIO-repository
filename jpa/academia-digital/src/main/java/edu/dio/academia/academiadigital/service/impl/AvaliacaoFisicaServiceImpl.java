package edu.dio.academia.academiadigital.service.impl;

import edu.dio.academia.academiadigital.entity.Aluno;
import edu.dio.academia.academiadigital.entity.AvaliacaoFisica;
import edu.dio.academia.academiadigital.entity.form.AvaliacaoFisicaForm;
import edu.dio.academia.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import edu.dio.academia.academiadigital.repository.AlunoRepository;
import edu.dio.academia.academiadigital.repository.AvaliacaoFisicaRepository;
import edu.dio.academia.academiadigital.service.AlunoService;
import edu.dio.academia.academiadigital.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService {

    @Autowired
    AvaliacaoFisicaRepository avaliacaoFisicaRepository;
    @Autowired
    AlunoRepository alunoRepository;
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {

        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return avaliacaoFisicaRepository.findById(id).orElseThrow(() -> new RuntimeException("Avaliacao Física não encontrada"));
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        AvaliacaoFisica avaliacaoFisica = this.get(id);
        avaliacaoFisica.setPeso(formUpdate.getPeso());
        avaliacaoFisica.setAltura(formUpdate.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public void delete(Long id) {
        AvaliacaoFisica avaliacaoFisica = this.get(id);
        avaliacaoFisicaRepository.delete(avaliacaoFisica);
    }
}
