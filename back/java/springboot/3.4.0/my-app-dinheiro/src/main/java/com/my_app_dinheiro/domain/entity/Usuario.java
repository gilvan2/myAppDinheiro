package com.my_app_dinheiro.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String cpf;

    @NotNull
    private String nome;

    @NotNull
    private String usuario;

    @NotNull
    private String email;

    @NotNull
    private String senha;

    public Usuario(){};

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getCpf(){return cpf;}
    public void setCpf(String cpf){this.cpf = cpf;}
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getUsuario(){return usuario;}
    public void setUsuario(String usuario){this.usuario = usuario;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}
    public String getSenha(){return senha;}
    public void setSenha(String senha){this.senha = senha;}
}
