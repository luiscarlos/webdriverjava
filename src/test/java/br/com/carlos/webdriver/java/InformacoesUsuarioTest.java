package br.com.carlos.webdriver.java;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {
	@Test
	public void TestMetodoAssert() {
		// quando o import não tem stacic ex: import org.junit.Assert.*;
		// Assert.assertEquals(1, 1);

	}

	@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
		// Abrindo o Navegado
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\drivers\\chromedriver.exe");

		// abrir o navegador
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navegando para a pagina desejada
		navegador.get("http://www.juliodelima.com.br/taskit");

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
		assertEquals("Hi,Julio", textoNoElementoMe);

		// 8 Fechar o navegador
		navegador.close();// fecha apenas uma aba
		// navegador.quit(); // fecha todas as abas
		// 9 Validação

	}

}