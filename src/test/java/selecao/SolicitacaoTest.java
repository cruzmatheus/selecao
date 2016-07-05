package selecao;


import org.junit.*;

import static org.junit.Assert.*;
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
		Colaborador colaborador = ColaboradorFactory.buildColaborador();
		solicitacao.adicionarColaborador(colaborador);

		assertNotNull(solicitacao.getColaborador());
		assertEquals(solicitacao.getColaborador().getNome(), "Matheus");
	}
	
	@Test
	public void testAdicionarCustos() {
		Custo passagem = new Passagem();
		Custo hospedagem = new Hospedagem();
		
		solicitacao.adicionarCusto(passagem, hospedagem);
		
		assertEquals(solicitacao.getCustos().size(), 2);
		assertArrayEquals(solicitacao.getCustos().toArray(), new Custo[] {passagem, hospedagem});
	}

}
