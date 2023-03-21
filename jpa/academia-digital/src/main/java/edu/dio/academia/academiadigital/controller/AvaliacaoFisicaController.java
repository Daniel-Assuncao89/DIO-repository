package edu.dio.academia.academiadigital.controller;

import edu.dio.academia.academiadigital.entity.Aluno;
import edu.dio.academia.academiadigital.entity.AvaliacaoFisica;
import edu.dio.academia.academiadigital.entity.form.AlunoUpdateForm;
import edu.dio.academia.academiadigital.entity.form.AvaliacaoFisicaForm;
import edu.dio.academia.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import edu.dio.academia.academiadigital.service.impl.AvaliacaoFisicaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaService;


    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form){
        return avaliacaoFisicaService.create(form);
    }

    @PutMapping("/{id}")
    public AvaliacaoFisica update(@PathVariable Long id, @Valid @RequestBody AvaliacaoFisicaUpdateForm avaliacaoFisicaUpdateForm){
        return avaliacaoFisicaService.update(id, avaliacaoFisicaUpdateForm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        avaliacaoFisicaService.delete(id);
    }

}
