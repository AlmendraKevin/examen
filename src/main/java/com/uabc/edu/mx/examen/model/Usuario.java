package com.uabc.edu.mx.examen.model;

import javax.persistence.*;

@Entity
@Table(name = "USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username", nullable=false, length=100)
    private String username;
    @Column(name="pass", nullable=false, length=100)
    private String passUser;

    @Column(name="nivel_acceso", nullable=false)
    private Boolean nivelAcceso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public Boolean getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(Boolean nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passUser='" + passUser + '\'' +
                ", nivelAcceso=" + nivelAcceso +
                '}';
    }

}
