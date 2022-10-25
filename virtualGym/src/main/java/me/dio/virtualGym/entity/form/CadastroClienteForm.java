package me.dio.virtualGym.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CadastroClienteForm {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Positive(message = "O Id do cliente precisa ser positivo.")
    private Long clienteId;
}
