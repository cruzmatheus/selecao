package br.com.digithobrasil.selecao.service;

import java.io.Serializable;
import java.util.List;

import br.com.digithobrasil.selecao.model.Colaborador;
import br.com.digithobrasil.selecao.model.ColaboradorFactory;

public class ColaboradorService implements Serializable {

	private static final long serialVersionUID = 1104714241773413248L;

	public Colaborador buscarProMatricula(String matricula) {
		List<Colaborador> colaboradores = ColaboradorFactory.colaboradores;
		
		for (Colaborador colaborador : colaboradores) {
			if (colaborador.getMatricula().equalsIgnoreCase(matricula))
				return colaborador;
		}
		
		return null;
	}
}
