package com.pietro.crud.service;

import com.pietro.crud.model.Usuario;
import com.pietro.crud.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario salvarUsuario(Usuario usuario) {
        LOGGER.info("Salvando: " + usuario.getNome());
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        LOGGER.info("Listando...");
        return usuarioRepository.findAll();
    }

    public void deletarUsuario(UUID id) {
        LOGGER.info("Deletando...");
        usuarioRepository.deleteById(id);
    }

}
