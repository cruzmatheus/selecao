package br.com.digithobrasil.test.funcionais;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagina {
	
	WebDriver driver;

	@Before
	public void setup() throws ClassNotFoundException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matheus\\Desktop\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/selecao");
	}
	
	@After
	public void tearDown() {
//		driver.quit();
	}
	
	public void preencherCampo(String nomeCampo, String valor) {
		WebElement campo = driver.findElement(By.id(nomeCampo));
		campo.sendKeys(valor);
	}
	
	 public void selectOne(String idPrefix, String value) throws InterruptedException {
        if (value != null && !value.isEmpty()) {
            driver.findElement(By.id(idPrefix + "_label")).click();
            Thread.sleep(250);
            driver.findElement(By.xpath("//div[@id='" + idPrefix + "_panel']/div/ul/li[text()='" + value + "']")).click();
        }
     }
	 
	 public void click(String campo) {
		 WebElement botao = driver.findElement(By.id(campo));
		 botao.click();
	 }
	 
	 public WebElement esperarBotaoPorNome(String campo, long segundos) {
		 WebDriverWait wait = new WebDriverWait(driver, segundos);
		 return wait.until(ExpectedConditions.elementToBeClickable(By.linkText(campo)));
	 }
	 
	 public WebElement esperarBotaoPorId(String campo, long segundos) {
		 WebDriverWait wait = new WebDriverWait(driver, segundos);
		 return wait.until(ExpectedConditions.elementToBeClickable(By.id(campo)));
	 }


}
