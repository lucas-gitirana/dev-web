package com.api_rest.demo.service;

import com.api_rest.demo.model.Projeto;
import org.springframework.stereotype.Service;

@Service
public class ProjetoService {

    public Projeto getProjeto() {
        Projeto p = new Projeto(1, "Projeto 1", "Paulo Roberto Farah");
        return p;
    }

}
