package com.example.demosesion4sb.modelo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Asesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idasesor")
    private Integer id;

    private String nombre;
    private String nombreusuario;
    private String email;
    private String telefono;
    private String pais;
    private String lugar;
    private String redessociales;

}
