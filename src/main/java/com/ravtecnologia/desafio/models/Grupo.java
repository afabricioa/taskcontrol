package com.ravtecnologia.desafio.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long grupo_id;

	@NotBlank(message = "O nome do grupo deve ser preenchido")
	private String grupo_nome;
	
	@OneToMany(targetEntity = Atividade.class, mappedBy = "grupo", cascade = CascadeType.ALL)
	private List<Atividade> atividades;
	
	public Grupo() {}
	
	public long getGrupo_id() {
		return grupo_id;
	}

	public void setGrupo_id(long grupo_id) {
		this.grupo_id = grupo_id;
	}

	public String getGrupo_nome() {
		return grupo_nome;
	}

	public void setGrupo_nome(String grupo_nome) {
		this.grupo_nome = grupo_nome;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	
	
}
