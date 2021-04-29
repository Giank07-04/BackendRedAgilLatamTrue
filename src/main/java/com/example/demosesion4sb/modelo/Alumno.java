package com.example.demosesion4sb.modelo;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalumno")
    private Integer id;

    private String codcli;
    private String nombre;
    private String tipodocumento;
    private String ndocumento;
    private String email;
    private String telefono;
    private String cursointeres;
    private String tipocliente;
    private String empresa;
    private String cargo;
    private String estado;
    private String comoseentero;

    @ManyToOne
    @JoinColumn(name = "idasesor", referencedColumnName = "idasesor")
    private Asesor asesor;

    private LocalDateTime ultimoregistro;

}
