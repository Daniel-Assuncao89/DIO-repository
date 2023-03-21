package edu.dio.academia.academiadigital.controller;

import edu.dio.academia.academiadigital.entity.Aluno;
import edu.dio.academia.academiadigital.entity.AvaliacaoFisica;
import edu.dio.academia.academiadigital.entity.form.AlunoForm;
import edu.dio.academia.academiadigital.entity.form.AlunoUpdateForm;
import edu.dio.academia.academiadigital.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento){
        return alunoService.getAll(dataDeNascimento);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id){
        return alunoService.getAllAvaliacaoFisica(id);
    }

    @PutMapping("/{id}")
    public Aluno update(@PathVariable Long id, @Valid @RequestBody AlunoUpdateForm alunoUpdateForm){
        return alunoService.update(id, alunoUpdateForm);
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return alunoService.create(form);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        alunoService.delete(id);
    }
}
