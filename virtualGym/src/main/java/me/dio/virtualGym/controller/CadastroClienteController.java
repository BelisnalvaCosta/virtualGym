package me.dio.virtualGym.controller;

import me.dio.virtualGym.entity.form.CadastroClienteForm;
import me.dio.virtualGym.service.CadastroClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matriculas")
public class CadastroClienteController {
    @Autowired
    private CadastroClienteServiceImpl service;

    @PostMapping
    public CadastroCliente create(@Valid @RequestBody CadastroClienteForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<CadastroCliente> getAll(@RequestParam(value = "bairro", required = false)
                                                String bairro) {
        return service.getAll(bairro);
    }
}
