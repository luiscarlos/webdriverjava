package br.com.carlos.webdriver.java;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class InformacoesUsuarioTest {
    @Test
    public void TestMetodoAssert() {
    	// quando o import não tem stacic ex: import org.junit.Assert.*;
    	// Assert.assertEquals(1, 1);
    	assertEquals(1, 1);
      }
    
    @Test
    public void TestAdicionarUmaInformacaoAdicionalDoUsuario() {
    	 //Abrindo o Navegador
    	System.setProperty("webdriver.chrome.driver","C:\\temp\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver(); // abrir o navegador
        
        //1 Clicar no link que possui o texto "Sign in"
        //2 Clicar no campo que tem o id="login-sign-in"
        //3 Digitar julio0001
        //4 Clicar no campo que tem o id="password-sign-in"
        //5 Digitar 123456
        //6 Clicar no link que tem id="btn-submit-sign-in"
        //7 Validar que dentro do elemento class="me" esta o texto "Hi, julio"
        //8 Fechar o navegador
        
        
        navegador.get("http://www.juliodelima.com.br/taskit"); //Navegando para a pagina desejada
        
    }
   }