package br.com.digithobrasil.selecao.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;

public class ColaboradorFactory {
	
	private static Fairy fairy = Fairy.create();
	public static List<Colaborador> colaboradores = new ArrayList<>();
	
	static {
		for (int i = 0; i < 9; i++) {
			Person person = fairy.person();
			Colaborador colaborador = new Colaborador(person.firstName() + " " + person.lastName(), "Desenvolvedor", i+"",new Date(person.dateOfBirth().getMillis()), person.nationalIdentificationNumber(), person.nationalIdentificationNumber(), person.email(), person.telephoneNumber());
			colaboradores.add(colaborador);
			
			if (i <= 2) {
				colaborador.setEquipe(EquipeFactory.equipe1);
			} else if (i >= 3 && i <= 6) {
				colaborador.setEquipe(EquipeFactory.equipe2);
			} else if (i >= 7 && i <= 9) {
				colaborador.setEquipe(EquipeFactory.equipe3);
			}
			
		}
	}

}
