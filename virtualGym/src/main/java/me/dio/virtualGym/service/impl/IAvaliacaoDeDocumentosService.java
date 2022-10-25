package me.dio.virtualGym.service.impl;

import me.dio.virtualGym.entity.AvaliacaoDeDocumentos;
import me.dio.virtualGym.entity.form.AvaliacaoDeDocumentosForm;

import java.util.List;

public interface IAvaliacaoDeDocumentosService {
    /**
     * Cria uma Avaliacão de Documentos e salva no Banco de Dados(DB).
     * @param form - formulário referente aos dados para acriação da Avaliação dos Documentos no banco de dados.
     * @return - Avaliação de Documentos recém-criado.
     */

    AvaliacaoDeDocumentos create(AvaliacaoDeDocumentosForm form);
    /**
     *Retorna um Avaliação de Documentos que está no Banco de Dados(DB) de acordo com seu Id.
     * @param id - id da Avaliação de Documentos que será exibido.
     * #return - Avaliação dos Documentos de acordo com o Id fornecido.
     */

    AvaliacaoDeDocumentos get(Long id);
    /**
     *Retorna todas as Avaliações de Documentos dos Clientes que estão no Banco de Dados(DB).
     * #return - uma lista com todas as Avaliações que estão salvos no DB.
     */

    List<AvaliacaoDeDocumentos> getAll();
    /**
     * Atualiza a avaliação de documentos.
     * @param id - id da avaliação de documentos que será atualizado.
     * @param formUpdate - formulário referente aos dados necessários para atualização da Avaliação
     * dos Documentos no Banco de Dados.
     * @return - Avaliação de Documentos recém-atualizados.
     */

    AvaliacaoDeDocumentos update(Long id, AvaliacaoDeDocumentosForm formUpdate);
    /**
     * Deleta uma Avaliação de Documentos específicos.
     * @param id - id da Avaliação de Documentos do Cliente que será removido.
     */
    void delete(Long id);
}
