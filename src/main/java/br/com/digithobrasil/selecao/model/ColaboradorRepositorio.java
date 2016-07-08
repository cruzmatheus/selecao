package br.com.digithobrasil.selecao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;

@Stateless
public class ColaboradorRepositorio extends Repositorio<Colaborador> implements Serializable{
	
	private static final long serialVersionUID = -1449629713210786844L;
	
	private Map<Integer, Colaborador> colaboradorDb;

	public ColaboradorRepositorio() {
		colaboradorDb = new HashMap<Integer, Colaborador>();
	}

	@Override
	public void salvar(Colaborador colaborador) {
		Integer id = proximoId();
		colaborador.setId(id);
		colaboradorDb.put(id, colaborador);
	}
	
	@Override
	public void atualizar(Colaborador colaborador) {
		colaboradorDb.remove(colaborador.getId());
		colaboradorDb.put(colaborador.getId(), colaborador);
	}

	@Override
	public List<Colaborador> buscarTodos() {
		return new ArrayList<>(colaboradorDb.values());
	}
	

}
