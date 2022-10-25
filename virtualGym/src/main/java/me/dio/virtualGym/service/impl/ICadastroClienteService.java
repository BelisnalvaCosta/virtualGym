package me.dio.virtualGym.service.impl;

public interface ICadastroClienteService {
    /**
     * Cria uma Cadastro e salva no Banco de Dados(DB).
     * @param form - formulário referente aos dados para acriação do Cadastro no banco de dados.
     * @return - Cadastro recem-criado.
     */

    CadastroCliente create(CadastroForm form);

    /**
     *Retorna um Cadastro que está no Banco de Dados(DB) de acordo com seu Id.
     * @param id - id do Cadastro do Cliente que será exibido.
     * #return - Cadastro de acordo com o Id fornecido.
     */

    CadastroCliente get(Long id);
    /**
     *Retorna todos os Cadastros dos Clientes que estão no Banco de Dados(DB).
     * #return - uma lista com todos os Cadastro que estão salvos no DB.
     */

    List<CadastroCliente> getAll();
    /**
     * Deleta um Cadastro específico.
     * @param id - id do Cadastro que será removido.
     */
    void delete(Long id);
}
