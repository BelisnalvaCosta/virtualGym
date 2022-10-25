package me.dio.virtualGym.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoDeDocumentosUpdateForm {
    private int numeroAtual;

    private int numeroAntigo;
}
