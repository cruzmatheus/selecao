package br.com.digithobrasil.selecao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;

@Stateless
public class SolicitacaoRepositorio extends Repositorio<Solicitacao> implements Serializable {
	
	private static final long serialVersionUID = 3821911348115392092L;
	
	private Map<Integer, Solicitacao> solicitacaoDb;

	public SolicitacaoRepositorio() {
		solicitacaoDb = new HashMap<Integer, Solicitacao>();
	}

	@Override
	public void salvar(Solicitacao solicitacao) {
		Integer id = proximoId();
		solicitacao.setId(id);
		solicitacaoDb.put(id, solicitacao);
	}
	
	@Override
	public void atualizar(Solicitacao solicitacao) {
		solicitacaoDb.remove(solicitacao.getId());
		solicitacaoDb.put(solicitacao.getId(), solicitacao);
	}

	@Override
	public List<Solicitacao> buscarTodos() {
		return new ArrayList<>(solicitacaoDb.values());
	}
	
	public List<Solicitacao> listarPorEquipe(Equipe equipe) {
		List<Solicitacao> retorno = new ArrayList<>();
		for (Solicitacao solicitacao : solicitacaoDb.values()) {
			if (solicitacao.getColaborador().getEquipe() == equipe || solicitacao.getColaborador().getEquipe().getSuperiores() == equipe) {
				retorno.add(solicitacao);
			}
		}
		
		return retorno;
	}

}
