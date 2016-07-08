package br.com.digithobrasil.selecao.model;

import java.io.Serializable;

public class Decisao implements Serializable {
	
	private static final long serialVersionUID = -693742513988874937L;
	
	private Boolean deferida;
	private String consideracoes;
	private Colaborador colaborador;
	
	public Decisao() { }
	
	public Decisao(Boolean deferida, String justificativaIndeferimento, Colaborador colaborador) {
		this.deferida = deferida;
		this.consideracoes = justificativaIndeferimento;
		this.colaborador = colaborador;
	}
	public Boolean getDeferida() {
		return deferida;
	}
	public void setDeferida(Boolean deferida) {
		this.deferida = deferida;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public String getConsideracoes() {
		return consideracoes;
	}

	public void setConsideracoes(String consideracoes) {
		this.consideracoes = consideracoes;
	}

}
