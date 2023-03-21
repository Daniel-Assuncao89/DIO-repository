package edu.dio.academia.academiadigital.service.impl;

import edu.dio.academia.academiadigital.entity.Aluno;
import edu.dio.academia.academiadigital.entity.AvaliacaoFisica;
import edu.dio.academia.academiadigital.entity.form.AlunoForm;
import edu.dio.academia.academiadigital.entity.form.AlunoUpdateForm;
import edu.dio.academia.academiadigital.infra.utils.JavaTimeUtils;
import edu.dio.academia.academiadigital.repository.AlunoRepository;
import edu.dio.academia.academiadigital.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return alunoRepository.save(aluno);

    }

    @Override
    public Aluno get(Long id) {
        return alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {

        if(dataDeNascimento == null){
            return alunoRepository.findAll();
        }else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return alunoRepository.findByDataDeNascimento(localDate);
        }

    }


    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        Aluno aluno = this.get(id);
        aluno.setNome(formUpdate.getNome());
        aluno.setBairro(formUpdate.getBairro());
        return alunoRepository.save(aluno);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        return aluno.getAvaliacoes();
    }



}
