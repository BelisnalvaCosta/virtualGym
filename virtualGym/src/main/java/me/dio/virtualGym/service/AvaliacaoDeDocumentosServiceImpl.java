package me.dio.virtualGym.service;

import me.dio.virtualGym.entity.AvaliacaoDeDocumentos;
import me.dio.virtualGym.entity.form.AvaliacaoDeDocumentosForm;
import me.dio.virtualGym.repository.AvaliacaoDeDocumentosRepository;
import me.dio.virtualGym.repository.ClienteRepository;
import me.dio.virtualGym.service.impl.IAvaliacaoDeDocumentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service;
public class AvaliacaoDeDocumentosServiceImpl implements IAvaliacaoDeDocumentosService {
    @Autowired
    private AvaliacaoDeDocumentosRepository avaliacaoDeDocumentosRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public AvaliacaoDeDocumentos create(AvaliacaoDeDocumentosForm form) {
        AvaliacaoDeDocumentos avaliacaoDeDocumentos = new AvaliacaoDeDocumentos();
        clienteRepository.findAllById(form.getClienteId()).get();

        avaliacaoDeDocumentos.setCliente(Cliente);
        avaliacaoDeDocumentos.setNumeroAtual(form.getNumeroAtual());
        avaliacaoDeDocumentos.setNumeroAntigo(form.getNumeroAntigo());

        return avaliacaoDeDocumentosRepository.save(avaliacaoDeDocumentos);
    }

    @Override
    public AvaliacaoDeDocumentos get(Long id) {
        return null;
    }

    public List<AvaliacaoDeDocumentos> getAll() {
    }
}
