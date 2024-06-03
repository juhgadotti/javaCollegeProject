package com.ads.pessoa.util;

import com.ads.pessoa.dto.request.FuncionarioRequestDTO;
import com.ads.pessoa.dto.response.FuncionarioResponseDTO;
import com.ads.pessoa.entity.Funcionario;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FuncionarioMapper {

    public Funcionario toFuncionario(FuncionarioRequestDTO funcionarioDTO) {
        return Funcionario.builder()
                .nome(funcionarioDTO.getNome())
                .doc(funcionarioDTO.getDoc())
                .idade(funcionarioDTO.getIdade())
                .setor(funcionarioDTO.getSetor())
                .cargo(funcionarioDTO.getCargo())
                .build();
    }

    public FuncionarioResponseDTO toFuncionarioDTO(Funcionario funcionario) {
        return new FuncionarioResponseDTO(funcionario);
    }

    public List<FuncionarioResponseDTO> toFuncionariosDTO(List<Funcionario> funcionariosList) {
        return funcionariosList.stream().map(FuncionarioResponseDTO::new).collect(Collectors.toList());
    }

    public void updateFuncionario(Funcionario funcionario, FuncionarioRequestDTO funcionarioDTO){

        funcionario.setNome(funcionarioDTO.getNome());
        funcionario.setDoc(funcionarioDTO.getDoc());
        funcionario.setIdade(funcionarioDTO.getIdade());
        funcionario.setSetor(funcionarioDTO.getSetor());
        funcionario.setCargo(funcionarioDTO.getCargo());
    }
}
