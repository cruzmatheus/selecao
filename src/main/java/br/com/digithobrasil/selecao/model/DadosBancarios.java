package br.com.digithobrasil.selecao.model;

import java.io.Serializable;

public class DadosBancarios implements Serializable {
	
	private static final long serialVersionUID = 6547393770872739246L;
	
	private String banco;
	private String agencia;
	private String contaCorrente;
	
	public DadosBancarios(){}
	
	public DadosBancarios(String banco, String agencia, String contaCorrente) {
		super();
		this.banco = banco;
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	
	
	
	

}
