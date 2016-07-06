package br.com.digithobrasil.test;

import org.junit.Before;
import org.junit.Test;

import br.com.digithobrasil.selecao.model.Colaborador;
import br.com.digithobrasil.selecao.model.DadosBancarios;
import static org.junit.Assert.*;

public class ColaboradorTest {
	
	Colaborador colaborador;
	
	@Before
	public void setup() {
		colaborador = ColaboradorFactory.buildColaborador();
	}
	

}
