package com.ravtecnologia.desafio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Atividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long atividade_id;

	@NotBlank(message = "O nome da atividade deve ser preenchido")
	private String atividade_nome;
	
	@ManyToOne
	@JoinColumn(name = "grupo_id")
	private Grupo grupo;
	
	public Atividade() {}
	
	public long getAtividade_id() {
		return atividade_id;
	}

	public void setAtividade_id(long atividade_id) {
		this.atividade_id = atividade_id;
	}

	public String getAtividade_nome() {
		return atividade_nome;
	}

	public void setAtividade_nome(String atividade_nome) {
		this.atividade_nome = atividade_nome;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}
