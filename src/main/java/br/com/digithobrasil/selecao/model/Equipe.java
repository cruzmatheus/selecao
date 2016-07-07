package br.com.digithobrasil.selecao.model;

import java.io.Serializable;
import java.util.List;

public class Equipe implements Serializable {
	
	private static final long serialVersionUID = 2049733587759042588L;
	
	private String nome;
	private List<Colaborador> colaboradores;
	private Equipe superiores;
	
	
	public Equipe() {
	}
	public Equipe(String nome) {
		this.nome = nome;
	}
	public Equipe(String nome, Equipe superiores) {
		this.nome = nome;
		this.superiores = superiores;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Equipe getSuperiores() {
		return superiores;
	}
	public void setSuperiores(Equipe superiores) {
		this.superiores = superiores;
	}
	public List<Colaborador> getColaboradores() {
		return colaboradores;
	}
	public void setColaboradores(List<Colaborador> colaboradores) {
		this.colaboradores = colaboradores;
	}
	
	

}
