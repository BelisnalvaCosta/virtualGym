package me.dio.virtualGym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoDeDocumentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private LocalDateTime dataDaAvalicao = LocalDateTime.now();

    @Column(name = "numero_atual")
    private int numeroAtual;

    @Column(name = "numero_antigo")
    private int numeroAntigo;
}
