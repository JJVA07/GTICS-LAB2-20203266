package com.example.lab220203266.entidad;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seleccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idseleccion;
    private String nombre;
    private String tecnico;
}
