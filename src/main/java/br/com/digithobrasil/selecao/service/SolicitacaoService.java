package br.com.digithobrasil.selecao.service;

import java.io.Serializable;

import javax.ejb.EJB;

import br.com.digithobrasil.selecao.model.Solicitacao;
import br.com.digithobrasil.selecao.model.SolicitacaoRepositorio;

public class SolicitacaoService implements Serializable {
	
	private static final long serialVersionUID = -442405657474428767L;
	
	@EJB
	SolicitacaoRepositorio solicitacaoRepositorio;
	
	public void salvar(Solicitacao solicitacao) {
		solicitacaoRepositorio.salvar(solicitacao);
	}
	

}
