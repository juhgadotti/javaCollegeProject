package com.ads.pessoa.repository;

import com.ads.pessoa.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Long>{

}
