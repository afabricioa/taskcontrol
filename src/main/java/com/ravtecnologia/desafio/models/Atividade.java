package com.ravtecnologia.desafio.models;


public class Atividade {

	private long atividade_id;

	private String atividade_nome;
	
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

}
