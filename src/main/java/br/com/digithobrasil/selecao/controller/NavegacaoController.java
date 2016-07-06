package br.com.digithobrasil.selecao.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class NavegacaoController {
	
	public String novaSolicitacao() {
		return "/paginas/solicitacao/novo?faces-redirect=true";
	}

}
