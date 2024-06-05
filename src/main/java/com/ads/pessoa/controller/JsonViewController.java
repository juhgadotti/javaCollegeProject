package com.ads.pessoa.controller;

import com.ads.pessoa.dto.response.FuncionarioResponseDTO;
import com.ads.pessoa.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/json")
@RequiredArgsConstructor

public class JsonViewController {

    private final FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>> findAll() {
        return ResponseEntity.ok().body(funcionarioService.findAll());
    }

}
