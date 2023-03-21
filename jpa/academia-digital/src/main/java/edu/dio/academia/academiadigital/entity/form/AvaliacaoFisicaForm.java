package edu.dio.academia.academiadigital.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

    private Long alunoId;

    @Positive(message = "Peso não pode ser negativo")
    @NotNull(message = "Peso precisa ser preenchido")
    private double peso;

    @Positive(message = "Altura não pode ser negativo")
    @NotNull(message = "Altura precisa ser preenchida")
    private double altura;
}
