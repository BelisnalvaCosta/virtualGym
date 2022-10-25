package me.dio.virtualGym.service.impl;

import me.dio.virtualGym.entity.AvaliacaoDeDocumentos;
import me.dio.virtualGym.entity.Cliente;
import me.dio.virtualGym.entity.form.ClienteForm;
import me.dio.virtualGym.entity.form.ClienteUpdateForm;

import java.util.List;

public interface IClienteService {
    /**
     * Cria um Cliente e salva no Banco de Dados(DB).
     *
     * @param form - formulário referente aos dados para acriação de um Cliente no banco de dados.
     * @return - Cliente recém-criado.
     */

    Cliente create(ClienteForm form);

    /**
     * Retorna um Cliente que está no Banco de Dados(DB) de acordo com seu Id.
     *
     * @param id - id do Cliente que será exibido.
     * @return - Cliente de acordo com o Id fornecido.
     */

    Cliente get(Long id);

    /**
     * Retorna todos os Clientes que estão no Banco de Dados(DB).
     *
     * @return - uma lista com todos os Cliente que estão salvos no DB.
     */

    List<Cliente> getAll(String dataDeNascimento);

    /**
     * Atualiza o Cliente.
     *
     * @param id         - id do Cliente que será atualizado.
     * @param formUpdate - formulário referente aos dados necessários para atualização do
     *                   Cliente no Banco de Dados(DB).
     * @return - Cliente recém-atualizado.
     */

    Cliente update(Long id, ClienteUpdateForm formUpdate);

    /**
     * Deleta um Cliente específico.     *
     * @param id - id do Cliente que será removido.
     */
    void delete(Long id);

    /**
     * Retorna um Cliente que está no Banco de Dados(DB) de acordo com seu Id.
     *
     * @param id - id do Cliente que será exibido.
     * @return - Cliente de acordo com o Id fornecido.
     */
    List<AvaliacaoDeDocumentos> getAllAvaliacaoDeDocumentosId(Long id);
}
