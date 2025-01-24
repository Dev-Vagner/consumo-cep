package com.accenture.consumo.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "Endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="cep")
    private String cep;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="completo")
    private String complemento;

    @Column(name="bairro")
    private String bairro;

    @Column(name="localidade")
    private String localidade;

    @Column(name="uf")
    private String uf;

    @Column(name="estado")
    private String estado;

    @Column(name="regiao")
    private String regiao;

    @Column(name="ibge")
    private String ibge;

    @Column(name="gia")
    private String gia;

    @Column(name="ddd")
    private String ddd;

    @Column(name="siafi")
    private String siafi;

}

