package edu.dio.academia.academiadigital.controller;

import edu.dio.academia.academiadigital.entity.Matricula;
import edu.dio.academia.academiadigital.entity.form.MatriculaForm;
import edu.dio.academia.academiadigital.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl matriculaService;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return matriculaService.create(form);
    }

    @GetMapping
    public List<Matricula> getall(@RequestParam(value = "bairro", required = false) String bairro){
        return matriculaService.getAll(bairro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        matriculaService.delete(id);
    }
}
