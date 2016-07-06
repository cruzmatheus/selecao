package br.com.digithobrasil.selecao.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class NavegacaoController {
	
	@Inject
	private SolicitacaoController solicitacaoController;
	
	public String novaSolicitacao() {
		return "/paginas/solicitacao/novo?faces-redirect=true";
	}
	
	public String listaSolicitacoes() {
		solicitacaoController.buscarTodas();
		return "/paginas/solicitacao/lista?faces-redirect=true";
	}

}
