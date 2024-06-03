package com.ads.pessoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuncionarioViewController {

    @GetMapping("/funcionario-view")
    public String funcionarioView() {
        return "funcionario";
    }

    @GetMapping("/register")
    public String registerFuncionario() {
        return "register";
    }

    @GetMapping("/listar")
    public String listarTodos() {
        return "listar";
    }
}