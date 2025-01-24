package com.accenture.consumo.interfaces;

import com.accenture.consumo.dto.EnderecoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "viacep", url= "https://viacep.com.br/ws")
public interface CepService {

    @RequestMapping(method = RequestMethod.GET, path="/{cep}/json")
    EnderecoDTO buscaEnderecoPorCep(@PathVariable String cep);
}
