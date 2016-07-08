package br.com.digithobrasil.test.funcionais;

import static org.junit.Assert.assertTrue;

import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormularioSolicitacaoTest extends Pagina {
	
	private Fairy fairy = Fairy.create();

	public void novaSolicitacao() {
		WebElement novaSolicitacaoBtn = driver.findElement(By.id("nova_solicitacao"));
		novaSolicitacaoBtn.click();
	}
	
//	@Test
	public void testCadastrarSolicitacaoSemNenhumaInformacao() {
		novaSolicitacao();
		click("efetuar_solicitacao");
		assertTrue(driver.getPageSource().contains("Campo necessário"));
	}
	
	@Test
	public void testCadastrarSolicitacao() throws InterruptedException {
		Person person = fairy.person();
		novaSolicitacao();
		preencherCampo("iNomeColaborador", person.firstName() + " " + person.lastName());
		selectOne("iCargoColaborador", "Desenvolvedor");
		preencherCampo("iMatriculaColaborador", "3213");
		
		driver.findElement(By.id("iDataNascimentoColaborador")).click();
		esperarBotaoPorNome("Prev", 10).click();
		driver.findElement(By.linkText("28")).click();
		
		preencherCampo("iRgColaborador", person.nationalIdentificationNumber());
		preencherCampo("iCpfColaborador", "003.442.233-78");
		preencherCampo("iEmailColaborador", person.email());
		
		preencherCampo("iBanco", "033");
		preencherCampo("iAgencia", "1234");
		preencherCampo("iContaCorrente", "532463-2");
		
		preencherCampo("iTituloCurso", "Programacao orientada a objetos");
		
		driver.findElement(By.id("iDataCurso")).click();
		esperarBotaoPorNome("Prev", 10).click();
		driver.findElement(By.linkText("28")).click();
		
		preencherCampo("iCargaHorariaCurso", "20");
		preencherCampo("iCidadeCurso", "Campo Grande");
		preencherCampo("iLocalCurso", "Escola Modelo");
		
		selectOne("iTipoCusto", "Hospedagem");
		preencherCampo("iValorCusto", "3");
		
		click("adicionar_custo");
		
		preencherCampo("iJustificativa", "Aprender acerca da programacao orientada a objetos");
		
		esperarBotaoPorId("efetuar_solicitacao", 10).click();
		
		assertTrue(driver.getPageSource().contains("Solicitação cadastrada com sucesso"));
	}
	
}
