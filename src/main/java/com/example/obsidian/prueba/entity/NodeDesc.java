package com.example.obsidian.prueba.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
@AllArgsConstructor
@ToString
public class NodeDesc {

    @Id
    private Long id;
    private String nombre;
    private String descripcion;
}
