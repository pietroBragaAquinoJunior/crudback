package com.pietro.crud.controller;

import com.pietro.crud.model.Funcionario;
import com.pietro.crud.model.Usuario;
import com.pietro.crud.service.FuncionarioService;
import com.pietro.crud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping()
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @PostMapping("/salvar-funcionario/nome/{nome}/email/{email}/telefone/{telefone}/cpf/{cpf}/salario/{salario}/horaEntrada/{horaEntrada}/horaSaida/{horaSaida}")
    public ResponseEntity salvarFuncionario(@PathVariable String nome, @PathVariable String email, @PathVariable String telefone, @PathVariable String cpf, @PathVariable Double salario, @PathVariable Integer horaEntrada, @PathVariable Integer horaSaida) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setTelefone(telefone);
        funcionario.setCpf(cpf);
        funcionario.setSalario(salario);
        funcionario.setHoraEntrada(horaEntrada);
        funcionario.setHoraSaida(horaSaida);
        return ResponseEntity.ok(funcionarioService.salvarFuncionario(funcionario));
    }

    @GetMapping("/listar-funcionarios")
    public ResponseEntity listarFuncionario() {
        List<Funcionario> lista = funcionarioService.listarFuncionarios();
        return ResponseEntity.ok(lista);
    }

    @DeleteMapping("/deletar-funcionario/id/{id}")
    public ResponseEntity deletarFuncionario(@PathVariable UUID id) {
        funcionarioService.deletarFuncionario(id);
        return ResponseEntity.ok().build();
    }

}