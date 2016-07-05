package br.com.digithobrasil.selecao.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solicitacao {

	private Colaborador colaborador;
	private Curso curso;
	private String justificativa;
	private float percentualSubsidio;
	private List<Custo> custos;
	
	public void adicionarColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	public void adicionarCusto(Custo... custos) {
		this.custos = Arrays.asList(custos);
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public float getPercentualSubsidio() {
		return percentualSubsidio;
	}

	public void setPercentualSubsidio(float percentualSubsidio) {
		this.percentualSubsidio = percentualSubsidio;
	}

	public List<Custo> getCustos() {
		return custos == null ? new ArrayList<Custo>() : custos;
	}

	public void setCustos(List<Custo> custos) {
		this.custos = custos;
	}

	
}
