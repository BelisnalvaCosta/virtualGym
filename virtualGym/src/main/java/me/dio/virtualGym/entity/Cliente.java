package me.dio.virtualGym.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_clientes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String cpf;

    @Column(unique = true)
    private String cnpj;

    private String bairro;

    private LocalDate dataDeNascimento;

    @OneToMany(mappedBy = "Cliente", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<AvaliacaoDeDocumentos> avaliacoes = new ArrayList<>();

    public static void getAvaliacaoDeDocumentos() {
    }
}
