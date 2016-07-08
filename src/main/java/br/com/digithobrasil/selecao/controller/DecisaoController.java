package br.com.digithobrasil.selecao.controller;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;

import br.com.digithobrasil.selecao.model.Decisao;
import br.com.digithobrasil.selecao.model.Solicitacao;
@ViewAccessScoped
@Named
public class DecisaoController implements Serializable {
	
	private static final long serialVersionUID = -5234589427319563048L;
	List<Decisao> decisoes;

	@Inject
	private NavegacaoController navegacaoController;
	
	public String visualizarDecisoes(Solicitacao solicitacao) {
		setDecisoes(solicitacao.getDecisoes());
		
		return navegacaoController.listarDecisoes();
	}

	public List<Decisao> getDecisoes() {
		return decisoes;
	}

	public void setDecisoes(List<Decisao> decisoes) {
		this.decisoes = decisoes;
	}
}
