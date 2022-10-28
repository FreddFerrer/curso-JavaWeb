package com.cursoJavaLucasMoy.curso.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "usuarios")
@ToString
public class Usuario {

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Id
    @Getter @Setter @Column(name = "id")
    private Long id;



    @Getter @Setter @Column(name = "email")
    private String email;



    @Getter @Setter
    private String password;




}
