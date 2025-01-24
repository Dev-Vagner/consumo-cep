package com.accenture.consumo.service;

import com.accenture.consumo.dto.EnderecoDTO;
import com.accenture.consumo.interfaces.CepService;
import com.accenture.consumo.model.Endereco;
import com.accenture.consumo.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastrarEndereco {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private CepService cepService;

    public Endereco cadastrar(String cep) {
        EnderecoDTO enderecoDTO = cepService.buscaEnderecoPorCep(cep);

        Endereco endereco = new Endereco();
        endereco.setCep(enderecoDTO.getCep());
        endereco.setLogradouro(enderecoDTO.getLogradouro());
        endereco.setComplemento(enderecoDTO.getComplemento());
        endereco.setBairro(enderecoDTO.getBairro());
        endereco.setLocalidade(enderecoDTO.getLocalidade());
        endereco.setUf(enderecoDTO.getUf());
        endereco.setEstado(enderecoDTO.getEstado());
        endereco.setRegiao(enderecoDTO.getRegiao());
        endereco.setIbge(enderecoDTO.getIbge());
        endereco.setGia(enderecoDTO.getGia());
        endereco.setDdd(enderecoDTO.getDdd());
        endereco.setSiafi(enderecoDTO.getSiafi());

        return enderecoRepository.save(endereco);
    }
}
