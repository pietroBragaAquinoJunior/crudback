package com.pietro.crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name="funcionario")
@Data
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String nome;
    String email;
    String telefone;
    String cpf;
    Double salario;
    @Min(0)
    @Max(24)
    Integer horaEntrada;
    @Min(0)
    @Max(24)
    Integer horaSaida;

}
