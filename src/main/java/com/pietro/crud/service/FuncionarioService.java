package com.pietro.crud.service;

import com.pietro.crud.model.Funcionario;
import com.pietro.crud.model.Usuario;
import com.pietro.crud.repository.FuncionarioRepository;
import com.pietro.crud.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class FuncionarioService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FuncionarioService.class);

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Transactional
    public Funcionario salvarFuncionario(Funcionario funcionario) {
        LOGGER.info("Salvando: " + funcionario.getNome());
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        LOGGER.info("Listando...");
        return funcionarioRepository.findAll();
    }

    public void deletarFuncionario(UUID id) {
        LOGGER.info("Deletando...");
        funcionarioRepository.deleteById(id);
    }

}
