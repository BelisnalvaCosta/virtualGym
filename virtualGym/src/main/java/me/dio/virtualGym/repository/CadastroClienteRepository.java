package me.dio.virtualGym.repository;

import java.util.List;

public interface CadastroClienteRepository {
    CadastroCliente save(CadastroCliente cadastroCliente);

    List<Object> findById(Long id);

    List<CadastroCliente> findAll();

    List<CadastroCliente> findClienteCadastroBairro(String bairro);
}
