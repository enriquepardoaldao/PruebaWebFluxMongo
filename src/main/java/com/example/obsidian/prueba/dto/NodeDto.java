package com.example.obsidian.prueba.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class NodeDto {
    private Long id;
    private String nombre;
    private String descripcion;
}
