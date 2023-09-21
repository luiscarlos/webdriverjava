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
        //2 Clicar no campo com name "login" que esta dentro do formulario de id="signinbox"
        //3 Digitar no campo com name "login" que esta dentro do formulario de id="signinbox" o texto "julio0001"
        //4 Clicar no campo com name "password" que esta dentro do formulario de id="signinbox"
        //5 Digitar no campo com name "password" que esta dentro do formulario de id="signinbox" o texto  "123456"
        //6 Clicar no link com o texto "SIGN IN"
        //7 Validar que dentro do elemento class="me" esta o texto "Hi, julio"
        //8 Fechar o navegador
        //9 Validação
        
        
        navegador.get("http://www.juliodelima.com.br/taskit"); //Navegando para a pagina desejada
        
    }
   }