package br.com.digithobrasil.selecao.model;

import java.io.Serializable;

public abstract class Custo implements Serializable {
	
	private static final long serialVersionUID = 6362111507161626687L;

	protected Double valor;
	protected String tipoCusto;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTipoCusto() {
		return tipoCusto;
	}
	

}
