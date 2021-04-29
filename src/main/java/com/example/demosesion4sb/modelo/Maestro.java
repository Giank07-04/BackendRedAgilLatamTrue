package com.example.demosesion4sb.modelo;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Maestro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmaestro")
    private Integer id;

    @NotBlank
    private String nombre;
}
