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
@Table(name = "tb_CadastroClientes")
public class CadastroCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL) //Se excluir um Cadastro, exclui também o Cliente
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private LocalDateTime dataDoCadastro = LocalDateTime.now();
}
public class CadastroCliente {
}
