package com.ads.pessoa.service;
import com.ads.pessoa.dto.request.FuncionarioRequestDTO;
import com.ads.pessoa.dto.response.FuncionarioResponseDTO;
import com.ads.pessoa.entity.Funcionario;
import com.ads.pessoa.repository.FuncionarioRepository;
import com.ads.pessoa.util.FuncionarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService{

    private final FuncionarioRepository funcionarioRepository;

    private final FuncionarioMapper funcionarioMapper;

    @Override
    public FuncionarioResponseDTO findById(Long id) {
        return funcionarioMapper.toFuncionarioDTO(returnFunc(id));
    }

    @Override
    public List<FuncionarioResponseDTO> findAll() {
        return funcionarioMapper.toFuncionariosDTO(funcionarioRepository.findAll());
    }

    @Override
    public FuncionarioResponseDTO register(FuncionarioRequestDTO funcionarioDTO) {
        Funcionario funcionario = funcionarioMapper.toFuncionario(funcionarioDTO);

        return funcionarioMapper.toFuncionarioDTO(funcionarioRepository.save(funcionario));
    }

    @Override
    public FuncionarioResponseDTO update(Long id, FuncionarioRequestDTO funcionarioDTO) {
        Funcionario funcionario = returnFunc(id);

        funcionarioMapper.updateFuncionario(funcionario, funcionarioDTO);

        return funcionarioMapper.toFuncionarioDTO(funcionarioRepository.save(funcionario));
    }

    @Override
    public String delete(Long id) {
        funcionarioRepository.deleteById(id);

        return "Funcionario deletado com sucesso";
    }

    private Funcionario returnFunc(Long id){
        return funcionarioRepository.findById(id).orElseThrow(()-> new RuntimeException("Funcionario nao encontrado"));
    }
}
