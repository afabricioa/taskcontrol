package com.ravtecnologia.desafio.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ravtecnologia.desafio.models.Atividade;
import com.ravtecnologia.desafio.models.Grupo;
import com.ravtecnologia.desafio.repositories.AtividadeRepository;
import com.ravtecnologia.desafio.repositories.GrupoRepository;

@RequestMapping("/taskcontrol")
public class TaskControlResource {

	@Autowired
	AtividadeRepository atividade_repository;
	
	@Autowired
	GrupoRepository grupo_repository;
	
	
	@GetMapping(value = "/atividade")
	public @ResponseBody Iterable<Atividade> getAtividades(){
		Iterable<Atividade> listaAtividades = atividade_repository.findAll();
		
		return listaAtividades;
	}
	
	@PostMapping("/atividade")
	public Atividade cadastrarAtividade(@RequestBody @Valid Atividade atividade) {
		atividade_repository.save(atividade);
		
		return atividade;
	}
	
	
	@GetMapping(value = "/grupo")
	public @ResponseBody Iterable<Grupo> getGrupos(){
		Iterable<Grupo> listaGrupos = grupo_repository.findAll();
		
		return listaGrupos;
	}
	
	@PostMapping("/grupo")
	public Grupo cadastrarGrupo(@RequestBody @Valid Grupo grupo) {
		grupo_repository.save(grupo);
		
		return grupo;
	}
	
}
