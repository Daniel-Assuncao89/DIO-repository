package edu.dio.academia.academiadigital.entity.form;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateForm {

    @Positive(message = "Peso não pode ser negativo")
    private double peso;

    @Positive(message = "Altura não pode ser negativo")
    private double altura;
}
