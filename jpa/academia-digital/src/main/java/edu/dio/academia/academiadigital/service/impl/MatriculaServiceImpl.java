package edu.dio.academia.academiadigital.service.impl;

import edu.dio.academia.academiadigital.entity.Aluno;
import edu.dio.academia.academiadigital.entity.Matricula;
import edu.dio.academia.academiadigital.entity.form.MatriculaForm;
import edu.dio.academia.academiadigital.repository.AlunoRepository;
import edu.dio.academia.academiadigital.repository.MatriculaRepository;
import edu.dio.academia.academiadigital.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        Matricula matricula = new Matricula();
        matricula.setAluno(aluno);
        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).orElseThrow(() -> new RuntimeException("Matricula não encontrada"));
    }

    @Override
    public List<Matricula> getAll(String bairro) {

        if(bairro == null){
            return matriculaRepository.findAll();
        }else {
            return matriculaRepository.findByAlunoBairro(bairro);
        }

    }

    @Override
    public void delete(Long id) {
        Matricula matricula = this.get(id);
        matriculaRepository.delete(matricula);
    }
}
