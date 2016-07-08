package br.com.digithobrasil.selecao.model;

import java.util.ArrayList;
import java.util.List;

public class EquipeFactory {
	
	public static Equipe equipe1;
	public static Equipe equipe2;
	public static Equipe equipe3;
	
	static {
		equipe1 = new Equipe("Diretores");
		equipe2 = new Equipe("Equipe Projeto 1", equipe1);
		equipe3 = new Equipe("Equipe Projeto 2", equipe1);
	}
	
	public static List<Equipe> equipes() {
		List<Equipe> equipes = new ArrayList<>();
		equipes.add(equipe1);
		equipes.add(equipe2);
		equipes.add(equipe3);
		
		return equipes;
	}

}
