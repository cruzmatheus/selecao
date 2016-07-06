package br.com.digithobrasil.selecao.model;

import java.io.Serializable;
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
		solicitacaoDb.put(proximoId(), solicitacao);
	}

	@Override
	public List<Solicitacao> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
