package com.ads.pessoa.controller;

import com.ads.pessoa.dto.request.FuncionarioRequestDTO;
import com.ads.pessoa.dto.response.FuncionarioResponseDTO;
import com.ads.pessoa.entity.Funcionario;
import com.ads.pessoa.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/funcionario")
@RequiredArgsConstructor
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FuncionarioResponseDTO> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(funcionarioService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>> findAll() {
        return ResponseEntity.ok().body(funcionarioService.findAll());
    }

    @PostMapping
    public ResponseEntity<FuncionarioResponseDTO> register(@RequestBody FuncionarioRequestDTO funcionarioRequestDTO, UriComponentsBuilder uriComponentsBuilder) {

        FuncionarioResponseDTO funcionarioResponseDTO = funcionarioService.register(funcionarioRequestDTO);

        URI uri = uriComponentsBuilder.path("/funcionario/{id}").buildAndExpand(funcionarioResponseDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(funcionarioResponseDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<FuncionarioResponseDTO> update(@RequestBody FuncionarioRequestDTO funcionarioDTO, @PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(funcionarioService.update(id, funcionarioDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(funcionarioService.delete(id));
    }

}
