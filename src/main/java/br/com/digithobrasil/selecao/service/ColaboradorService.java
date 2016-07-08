package br.com.digithobrasil.selecao.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;

import br.com.digithobrasil.selecao.model.Colaborador;
import br.com.digithobrasil.selecao.model.ColaboradorFactory;
import br.com.digithobrasil.selecao.model.ColaboradorRepositorio;

public class ColaboradorService implements Serializable {

	private static final long serialVersionUID = 1104714241773413248L;
	
	@EJB
	ColaboradorRepositorio colaboradorRepositorio;

	public Colaborador buscarPorMatricula(String matricula) {
		List<Colaborador> colaboradores = ColaboradorFactory.getColaboradores();
		colaboradores.addAll(buscarTodos());
		
		for (Colaborador colaborador : colaboradores) {
			if (colaborador.getMatricula().equalsIgnoreCase(matricula))
				return colaborador;
		}
		
		return null;
	}
	
	public List<Colaborador> buscarTodos() {
		return colaboradorRepositorio.buscarTodos();
	}
}
