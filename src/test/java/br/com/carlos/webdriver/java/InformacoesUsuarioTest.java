package br.com.carlos.webdriver.java;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class InformacoesUsuarioTest {
	
	private WebDriver navegador;

	@Before
	public void setUp() {
		// Abrindo o Navegado
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\drivers\\chromedriver.exe");

		// abrir o navegador
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navegando para a pagina desejada
		navegador.get("http://www.juliodelima.com.br/taskit");

	}

	@Test
	public void TestMetodoAssert() {
		// quando o import não tem stacic ex: import org.junit.Assert.*;
		assertEquals(1, 1);

	}

	@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
		setUp();
		
		// 1 Clicar no link que possui o texto "Sign in"
		navegador.findElement(By.linkText("Sign in")).click();
		// ou
		/*
		 * WebElement linkSignIn = navegador.findElement(By.linkText("Sign in"));
		 * linkSignIn.click();
		 */

		// 2 Identificar o formulário com campo login
		WebElement formularioASignInBox = navegador.findElement(By.id("signinbox"));

		// 3 Digitar no campo com name "login" que esta dentro do formulario de
		// id="signinbox" o texto "julio0001"
		formularioASignInBox.findElement(By.name("login")).sendKeys("julio0001");

		// 4 Clicar no campo com name "password" que esta dentro do formulario de
		// id="signinbox"
		// 5 Digitar no campo com name "password" que esta dentro do formulario de
		// id="signinbox" o texto "123456"
		formularioASignInBox.findElement(By.name("password")).sendKeys("123456");

		// 6 Clicar no link com o texto "SIGN IN"
		formularioASignInBox.findElement(By.linkText("SIGN IN")).click();

		// 7 Validar que dentro do elemento class="me" esta o texto "Hi, julio"
		WebElement me = navegador.findElement(By.className("me"));

		String textoNoElementoMe = me.getText();
		assertEquals("Hi, Julio", textoNoElementoMe);
		
		//Clicar em um link que possue a classe ="me"
		navegador.findElement(By.className("me")).click();
		
		//Clicar ni link com o nome "More data about you"
		navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
		
		//Clicar no botao atravez do seu xpath //div[@id="moredata"]//button[@data-target="addmoredata"]
		navegador.findElement(By.xpath("//div[@id=\"moredata\"]//button[@data-target=\"addmoredata\"]")).click();
		
		//Identificar a popup onde esta o formulario //div[@id="addmoredata"]//select[@name="type"]
		WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));
		
		// No combo de name="type" escolher a opção "Phone"
		WebElement campoType = popupAddMoreData.findElement(By.name("type"));
		new Select(campoType).selectByVisibleText("Phone");
		
		//No campo de name="contact" digitar "81999999999"
		popupAddMoreData.findElement(By.name("contact")).sendKeys("81999999999");
		
		//Clicar no link de text="SAVE" que esta na popup
		popupAddMoreData.findElement(By.linkText("SAVE")).click();
		
		// Na mensagem de id"toast-container" validar que o texto e"your contact has bean added!"
		WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
		String mensagem = mensagemPop.getText();
		assertEquals("Your contact has been added!", mensagem);
		
		
		
		
		
		// 9 Validação
		//tearDown();

	}

	@After
	public void tearDown() {

		// 8 Fechar o navegador
		navegador.close();// fecha apenas uma aba
		// navegador.quit(); // fecha todas as abas

	}

}