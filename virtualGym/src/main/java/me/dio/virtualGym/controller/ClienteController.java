package me.dio.virtualGym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl service;

    @PostMapping
    public Cliente create(@Valid @RequestBody ClienteForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Cliente> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                        String dataDeNascimento) {
        return service.getAll(dataDeNascimento);
    }

    @GetMapping("/avaliacoes/{Id}")
    public List<AvaliacaoDeDocumentos> getAllAvaliacaoDeDocumentos(@PathVariable long id) {
        return service.getAllAvaliacaoDeDocumentosId(id);
    }
}
