package br.com.digithobrasil.selecao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import br.com.digithobrasil.selecao.service.SolicitacaoService;

public class Solicitacao extends SolicitacaoRepositorio implements Serializable {

	private static final long serialVersionUID = 7294175903002652142L;
	
	private Colaborador colaborador;
	private Curso curso;
	private String justificativa;
	private float percentualSubsidio;
	private List<Custo> custos;
	
	public void preencherSolicitacao(Colaborador colaborador, Curso curso, List<Custo> custos) {
		this.colaborador = colaborador;
		this.curso = curso;
		this.adicionarCusto(custos);
	}
	
	public void adicionarCusto(List<Custo> custos) {
		this.custos = custos;
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
