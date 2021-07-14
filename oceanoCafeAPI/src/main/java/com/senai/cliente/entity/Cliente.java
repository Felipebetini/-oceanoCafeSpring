package com.senai.cliente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cliente")
public class Cliente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 11)
    private String sobrenome;

    @Column(nullable = false)
    private String rua;

    private String numeroApt;

    @Column(length = 50)
    private String email;

     public Cliente() {
    }

    public Cliente(Integer id, String nome, String sobrenome, String rua, String numeroApt, String email) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rua = rua;
        this.numeroApt = numeroApt;
        this.email = email;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumeroApt() {
		return numeroApt;
	}

	public void setNumeroApt(String numeroApt) {
		this.numeroApt = numeroApt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}
