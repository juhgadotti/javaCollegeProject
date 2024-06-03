package com.ads.pessoa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_funcionarios")
@NoArgsConstructor
@Getter
@Setter
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="doc", nullable = false, unique = true)
    private String doc;

    @Column(name="idade", nullable = false)
    private Integer idade;

    @Column(name="setor", nullable = false)
    private String setor;

    @Column(name="cargo", nullable = false)
    private String cargo;

    @Builder
    public Funcionario(String nome, String doc, Integer idade, String setor, String cargo) {
        this.nome = nome;
        this.doc = doc;
        this.idade = idade;
        this.setor = setor;
        this.cargo = cargo;
    }
}
