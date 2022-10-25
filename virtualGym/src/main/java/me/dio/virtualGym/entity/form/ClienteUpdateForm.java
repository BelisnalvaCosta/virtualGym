package me.dio.virtualGym.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteUpdateForm {
    private String nome;

    private String bairro;

    private LocalDate dataDeNascimento;
}
