package com.pietro.crud.controller;

import com.pietro.crud.model.Usuario;
import com.pietro.crud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping()
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/salvar-usuario/nome/{nome}/email/{email}/telefone/{telefone}")
    public ResponseEntity salvarUsuario(@PathVariable String nome, @PathVariable String email, @PathVariable String telefone) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);
        return ResponseEntity.ok(usuarioService.salvar(usuario));
    }

    @GetMapping("/listar-usuarios")
    public ResponseEntity listarUsuario() {
        List<Usuario> lista = usuarioService.listarUsuarios();
        return ResponseEntity.ok(lista);
    }

    @DeleteMapping("/deletar-usuario/id/{id}")
    public ResponseEntity deletarUsuario(@PathVariable UUID id) {
        usuarioService.deletarUsuario(id);
        return ResponseEntity.ok().build();
    }

}