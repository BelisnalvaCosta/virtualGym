package me.dio.virtualGym.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoDeDocumentosForm {

    @Positive(message = "O Id do cliente precisa ser positivo.")
    private Long clienteId;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Positive(message = "'${validatedValue}' precisa ser positivo.")
    private int numeroAtual;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Positive(message = "'${validatedValue}' é inválido!")
    private int numeroAntigo;
}
