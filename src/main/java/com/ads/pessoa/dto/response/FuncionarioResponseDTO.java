package com.ads.pessoa.dto.response;

import com.ads.pessoa.entity.Funcionario;
import lombok.Getter;

@Getter
public class FuncionarioResponseDTO {

    private Long id;

    private String nome;

    private String doc;

    private Integer idade;

    private String setor;

    private String cargo;

    public FuncionarioResponseDTO(Funcionario funcionario) {
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.doc = funcionario.getDoc();
        this.idade = funcionario.getIdade();
        this.setor = funcionario.getSetor();
        this.cargo = funcionario.getCargo();
    }
}
