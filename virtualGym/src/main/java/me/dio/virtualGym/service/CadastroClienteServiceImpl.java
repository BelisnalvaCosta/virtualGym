package me.dio.virtualGym.service;

import me.dio.virtualGym.entity.Cliente;
import me.dio.virtualGym.entity.form.CadastroClienteForm;
import me.dio.virtualGym.repository.CadastroClienteRepository;
import me.dio.virtualGym.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroClienteServiceImpl implements ICadastroClienteService {
    @Autowired
    private CadastroClienteRepository cadastroClienteRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public CadastroCliente create(CadastroClienteForm form) {
        CadastroCliente cadastroCliente = new CadastroCliente();
        Cliente cliente = clienteRepository.findAllById(form.getClienteId();
        cadastroCliente.setCliente(cliente);
        return cadastroClienteRepository.save(cadastroCliente);
    }

    @Override
    public CadastroCliente get(Long id) {
        return (CadastroCliente) cadastroClienteRepository.findById(id).get();
    }

    @Override
    public List<CadastroCliente> getAll(String bairro) {
        if(bairro == null) {
            return cadastroClienteRepository.findAll();
        }else{
            return cadastroClienteRepository.findClienteCadastroBairro(bairro);
        }
    }

    @Override
    public void delete(Long id) {}
}
