package com.ads.pessoa.service;

import com.ads.pessoa.dto.request.FuncionarioRequestDTO;
import com.ads.pessoa.dto.response.FuncionarioResponseDTO;

import java.util.List;


public interface FuncionarioService {
    FuncionarioResponseDTO findById(Long id);

    List<FuncionarioResponseDTO> findAll();

    FuncionarioResponseDTO register(FuncionarioRequestDTO funcionarioDTO);

    FuncionarioResponseDTO update(Long id, FuncionarioRequestDTO funcionarioDTO);

    String delete(Long id);
}
