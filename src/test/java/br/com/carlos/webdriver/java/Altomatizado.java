package br.com.carlos.webdriver.java;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import net.bytebuddy.asm.Advice.Enter;



public class Altomatizado {
	
	//private WebDriver webDriver;
	private ChromeDriver  chromeDriver;
	private final String URL_BASE	="https://www.google.com/";
	private final String DRIVER ="webdriver.chrome.driver";
	private final String CAMINHO_DRIVER = "C:\\temp\\drivers\\chromedriver.exe";
	
	@Test
	public void iniciar() {
		System.setProperty(DRIVER,CAMINHO_DRIVER );

		// abrindo o navegador
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		chromeDriver.manage().window().maximize();

		// Navegando para a pagina desejada/
		chromeDriver.get(URL_BASE);	
	}
	
	
	@Test
	public void devePesquisarNoGoogle() {
		        iniciar();
				
				WebElement campoPesquisa = chromeDriver.findElement(By.id("APjFqb"));
				campoPesquisa.sendKeys("aula de teclado" + Keys.ENTER);
				String resultado = chromeDriver.findElement(By.id("result-stats")).getText();
				assertTrue(resultado, resultado.contains("Aproximadamente"));
				//assertEquals("Aproximadamente 23.900.000 resultados", resultado); valor do tempo de pesquisa muda
				
				chromeDriver.quit();


	}
}
