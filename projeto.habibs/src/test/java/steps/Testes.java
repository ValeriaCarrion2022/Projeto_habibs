package steps;

import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class Testes {
	
	Elementos elemento = new Elementos();
	Metodos metodo = new Metodos();

	
	@Before
	public void acessarSite() {
		Executa.abrirNavegador(true);

	}
	
	@Test
	public void cadastro() throws InterruptedException{
	metodo.clicar(elemento.btncookies);	
	Thread.sleep(5000);
	metodo.clicar(elemento.btnperfil);
	Thread.sleep(3000);
	metodo.scroll(0, 500);
	metodo.clicar(elemento.btncadastro);
	metodo.escrever(elemento.cep,"07995-250");
	metodo.escrever(elemento.numero,"243");
	Thread.sleep(2000);
	metodo.clicar(elemento.encontrarcep);
	Thread.sleep(1000);
	metodo.clicar(elemento.btnsim);
	Thread.sleep(1000);
	metodo.escrever(elemento.email,"valeriacarrion2015@hotmail.com");
	metodo.escrever(elemento.confirmarEmail,"valeriacarrion2015@hotmail.com");
	Thread.sleep(1000);
	metodo.escrever(elemento.senha, "carri2019");
	metodo.escrever(elemento.nomecompleto, "valeria carrion");
	Thread.sleep(1000);
	metodo.escrever(elemento.cpf,"404.628.808-69");
	metodo.escrever(elemento.telefone, "(11) 98770-8411");
	Thread.sleep(1000);
	metodo.escrever(elemento.datanascimento,"02/01/1991");
	metodo.scroll(0, 1000);
	Thread.sleep(1000);
	metodo.clicar(elemento.btncontinuar);
	
	System.out.println("Teste executado com sucesso");
	
	}
	
	
	@Test
	public void login() throws InterruptedException{
		metodo.clicar(elemento.btncookies);	
		Thread.sleep(5000);
		metodo.clicar(elemento.btnperfil);
		Thread.sleep(3000);
		metodo.escrever(elemento.emaillogin,"valeriacarrion2015@hotmail.com");
		metodo.escrever(elemento.senhalogin, "carri2019");
		metodo.clicar(elemento.continuar);
		
		System.out.println("Teste executado com sucesso");
	
		
		
		
	}
	}
	