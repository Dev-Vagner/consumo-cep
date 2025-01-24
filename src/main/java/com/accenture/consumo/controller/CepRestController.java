package com.accenture.consumo.controller;

import com.accenture.consumo.dto.EnderecoDTO;
import com.accenture.consumo.interfaces.CepService;
import com.accenture.consumo.model.Endereco;
import com.accenture.consumo.service.CadastrarEndereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepRestController {

    @Autowired
    private CadastrarEndereco cadastrarEndereco;

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> getCep(@PathVariable String cep) {

        Endereco endereco = cadastrarEndereco.cadastrar(cep);

        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
    }

}
