package br.com.digithobrasil.selecao.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;

import br.com.digithobrasil.selecao.model.Colaborador;
import br.com.digithobrasil.selecao.model.ColaboradorFactory;

@ViewAccessScoped
@Named
public class ColaboradorController implements Serializable {

	private static final long serialVersionUID = -2439429242733144920L;
	
	private List<Colaborador> colaboradores;
	
	
	@PostConstruct
	public void preencherColaboradores() {
		setColaboradores(ColaboradorFactory.colaboradores);
	}
	
	public List<Colaborador> getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(List<Colaborador> colaboradores) {
		this.colaboradores = colaboradores;
	}

	

}
