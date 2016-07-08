package br.com.digithobrasil.selecao.model;

import java.io.Serializable;
import java.util.List;

public abstract class Repositorio<E> implements Serializable {
	
	private static final long serialVersionUID = -3721836194684209061L;
	
	private int ultimoId = 0;
	
	protected int proximoId() {
		return ++ultimoId;
	}

	abstract List<E> buscarTodos();

	abstract void salvar(E e);
	
	abstract void atualizar(E e);

}
