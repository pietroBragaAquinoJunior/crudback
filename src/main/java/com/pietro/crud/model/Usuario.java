package com.pietro.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

import java.util.UUID;

@Entity
@Table(name="usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String nome;
    String email;
    String telefone;

}
