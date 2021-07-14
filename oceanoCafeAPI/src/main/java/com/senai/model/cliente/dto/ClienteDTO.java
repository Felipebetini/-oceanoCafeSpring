package com.senai.model.cliente.dto;

import com.senai.cliente.entity.Cliente;

public class ClienteDTO {
	private Integer id;
	private String nome;
	private String sobrenome;
	private String rua;
	private String numeroApt;
	private String email;
	
	public ClienteDTO() {}
	
	public Cliente toEntidade() {
		return new Cliente(id, nome, sobrenome, rua, numeroApt, email);
		}
	
	public ClienteDTO(Integer id, String nome, String sobrenome, String rua, String numeroApt, String email) {
		this.id= id;
		this.nome = nome;
		this.sobrenome= sobrenome;
		this.rua = rua;
		this.numeroApt = numeroApt;
		this.email =email;
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

	public void setNomr(String nome) {
		if(nome.length() > 50) {
			throw new RuntimeException("");
		}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteDTO other = (ClienteDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
