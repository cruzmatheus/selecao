package br.com.digithobrasil.test.unitarios;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.digithobrasil.selecao.model.Colaborador;
import br.com.digithobrasil.selecao.model.Custo;
import br.com.digithobrasil.selecao.model.Hospedagem;
import br.com.digithobrasil.selecao.model.Passagem;
import br.com.digithobrasil.selecao.model.Solicitacao;

public class SolicitacaoTest  {
	
	Solicitacao solicitacao;
	
	@Before
	public void setup() {
		solicitacao = new Solicitacao();
	}
	
	@Test
	public void testValorPercentualSubsidio() {
		assertTrue(solicitacao.getPercentualSubsidio() >= 0);
		assertTrue(solicitacao.getPercentualSubsidio() <= 100);
	}
	
	@Test
	public void testAdicionaColaboradorASolicitacao() {
		Colaborador colaborador = ColaboradorFactory.buildColaboradorComDadosBancarios();
		solicitacao.setColaborador(colaborador);

		assertNotNull(solicitacao.getColaborador());
		assertEquals(solicitacao.getColaborador().getNome(), "Matheus");
	}
	
	@Test
	public void testAdicionarCustos() {
		Custo passagem = new Passagem();
		Custo hospedagem = new Hospedagem();
		
		List<Custo> custos = new ArrayList<Custo>();
		custos.add(passagem);
		custos.add(hospedagem);
		
		solicitacao.adicionarCusto(custos);
		
		assertEquals(solicitacao.getCustos().size(), 2);
		assertArrayEquals(solicitacao.getCustos().toArray(), new Custo[] {passagem, hospedagem});
	}

}
