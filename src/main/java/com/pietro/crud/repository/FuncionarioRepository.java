package com.pietro.crud.repository;

import com.pietro.crud.model.Funcionario;
import com.pietro.crud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionarioRepository extends JpaRepository<Funcionario, UUID> {


}
