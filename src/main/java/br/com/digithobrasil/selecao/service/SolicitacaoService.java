package br.com.digithobrasil.selecao.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;

import br.com.digithobrasil.selecao.model.ColaboradorRepositorio;
import br.com.digithobrasil.selecao.model.Equipe;
import br.com.digithobrasil.selecao.model.Solicitacao;
import br.com.digithobrasil.selecao.model.SolicitacaoRepositorio;

public class SolicitacaoService implements Serializable {
	
	private static final long serialVersionUID = -442405657474428767L;
	
	@EJB
	SolicitacaoRepositorio solicitacaoRepositorio;
	
	@EJB
	ColaboradorRepositorio colaboradorRepositorio;
	
	public void salvar(Solicitacao solicitacao) {
		colaboradorRepositorio.salvar(solicitacao.getColaborador());
		solicitacaoRepositorio.salvar(solicitacao);
	}
	
	public void atualizar(Solicitacao solicitacao) {
		solicitacaoRepositorio.atualizar(solicitacao);
	}
	
	public List<Solicitacao> buscarTodas() {
		return solicitacaoRepositorio.buscarTodos();
	}
	
	public List<Solicitacao> listarPorEquipe(Equipe equipe) {
		return solicitacaoRepositorio.listarPorEquipe(equipe);
	}
	

}
