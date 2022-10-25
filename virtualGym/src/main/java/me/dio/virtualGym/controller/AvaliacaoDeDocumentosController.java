package me.dio.virtualGym.controller;

import me.dio.virtualGym.entity.AvaliacaoDeDocumentos;
import me.dio.virtualGym.entity.form.AvaliacaoDeDocumentosForm;
import me.dio.virtualGym.service.AvaliacaoDeDocumentosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoDeDocumentosController {

    @Autowired
    private AvaliacaoDeDocumentosServiceImpl service;

    @PostMapping
    public AvaliacaoDeDocumentos create (@RequestBody AvaliacaoDeDocumentosForm form) {
        return service.create(form);
    }
    @GetMapping
    public List<AvaliacaoDeDocumentos> getAll() {
        return service.getAll();
    }
}
