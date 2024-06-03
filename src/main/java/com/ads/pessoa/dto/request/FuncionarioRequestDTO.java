package com.ads.pessoa.dto.request;

import lombok.Getter;

@Getter
public class FuncionarioRequestDTO {
    private String nome;

    private String doc;

    private Integer idade;

    private String setor;

    private String cargo;
}
