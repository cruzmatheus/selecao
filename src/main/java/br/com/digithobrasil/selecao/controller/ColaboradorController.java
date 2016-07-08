package br.com.digithobrasil.selecao.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;

import br.com.digithobrasil.selecao.model.Colaborador;
import br.com.digithobrasil.selecao.model.ColaboradorFactory;
import br.com.digithobrasil.selecao.service.ColaboradorService;

@ViewAccessScoped
@Named
public class ColaboradorController implements Serializable {

	private static final long serialVersionUID = -2439429242733144920L;
	
	@Inject
	private ColaboradorService colaboradorService;
	
	private List<Colaborador> colaboradores;
	
	
	@PostConstruct
	public void preencherColaboradores() {
		List<Colaborador> colaboradores = new ArrayList<>();
		colaboradores.addAll(ColaboradorFactory.getColaboradores());
		colaboradores.addAll(colaboradorService.buscarTodos());
		
		setColaboradores(colaboradores);
		
	}
	
	public List<Colaborador> getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(List<Colaborador> colaboradores) {
		this.colaboradores = colaboradores;
	}

	

}
