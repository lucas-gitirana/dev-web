package com.api_rest.demo.controller;

import com.api_rest.demo.model.Projeto;
import com.api_rest.demo.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/projeto")
    public Projeto getProjeto() {
        return projetoService.getProjeto();
    }

}
