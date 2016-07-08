package br.com.digithobrasil.selecao.model;

import java.io.Serializable;

public class Decisao implements Serializable {
	
	private static final long serialVersionUID = -693742513988874937L;
	
	private Boolean deferida;
	private String justificativaIndeferimento;
	private Colaborador colaborador;
	
	public Decisao() { }
	
	public Decisao(Boolean deferida, String justificativaIndeferimento, Colaborador colaborador) {
		this.deferida = deferida;
		this.justificativaIndeferimento = justificativaIndeferimento;
		this.colaborador = colaborador;
	}
	public Boolean getDeferida() {
		return deferida;
	}
	public void setDeferida(Boolean deferida) {
		this.deferida = deferida;
	}
	public String getJustificativaIndeferimento() {
		return justificativaIndeferimento;
	}
	public void setJustificativaIndeferimento(String justificativaIndeferimento) {
		this.justificativaIndeferimento = justificativaIndeferimento;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

}
