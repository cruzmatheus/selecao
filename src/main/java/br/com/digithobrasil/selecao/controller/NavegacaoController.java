package br.com.digithobrasil.selecao.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.digithobrasil.selecao.model.Solicitacao;

@Named
@RequestScoped
public class NavegacaoController {
	
	@Inject
	private SolicitacaoController solicitacaoController;
	
	public String novaSolicitacao() {
		solicitacaoController.setSolicitacao(new Solicitacao());
		return "/paginas/solicitacao/novo?faces-redirect=true";
	}
	
	public String listaSolicitacoes() {
		return "/paginas/solicitacao/lista?faces-redirect=true";
	}
	
	public String encaminharIndefeirmento(Solicitacao solicitacao) {
		solicitacaoController.setSolicitacao(solicitacao);
		return "/paginas/solicitacao/indeferimento?faces-redirect=true";
	}

	public String listarDecisoes() {
		return "/paginas/solicitacao/decisoes?faces-redirect=true";
	}

}
