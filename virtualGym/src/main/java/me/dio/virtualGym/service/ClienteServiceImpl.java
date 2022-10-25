package me.dio.virtualGym.service;

import me.dio.virtualGym.entity.AvaliacaoDeDocumentos;
import me.dio.virtualGym.entity.Cliente;
import me.dio.virtualGym.entity.form.ClienteForm;
import me.dio.virtualGym.entity.form.ClienteUpdateForm;
import me.dio.virtualGym.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public Cliente create(ClienteForm form) {
        Cliente cliente = new Cliente();
        cliente.setNome(form.getNome());
        cliente.setCpf(form.getCpf());
        cliente.setCnpj(form.getCnpj());
        cliente.setBairro(form.getBairro());
        cliente.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(cliente);
    }
    @Override
    public Cliente get(Long id) {
        return null;
    }

    @Override
    public List<Cliente> getAll(String dataDeNascimento) {
        if(dataDeNascimento = null) {
            return repository.findAll();
        }else{
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }
    }

    @Override
    public Cliente update(Long id, ClienteUpdateForm updateForm) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoDeDocumentos> getAllAvaliacaoDeDocumentosId(Long id) {
        repository.findById(id).get();
        return Cliente.getAvaliacaoDeDocumentos();
    }
}
