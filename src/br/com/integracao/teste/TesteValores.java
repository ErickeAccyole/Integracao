package br.com.integracao.teste;

import br.com.integracao.classes.Valores;
import junit.framework.TestCase;

import org.junit.Test;

public class TesteValores extends TestCase{
	Valores valores;
	
	public TesteValores(){
		valores = new Valores();
	}
	
	
	public void testeInsert(){
		int entrada = 2;
		boolean retornoFeito = valores.ins(entrada);
		
		assertTrue(retornoFeito);
	}
	
	public void testeDel(){
		int entrada = 3;
		valores.ins(3);
		int retornoFeito = valores.del(entrada);
		
		assertEquals(entrada, retornoFeito);
	}
	
	public void testeSize(){
		
		int retornoFeito = valores.size();
		
		assertEquals(valores.size(), retornoFeito);
	}
	
	public void testeMean(){
		int entrada = 2;
		boolean retornoFeito = valores.ins(entrada);
		
		assertTrue(retornoFeito);
	}
	
	public void testeGreater(){
		int entrada = 2;
		boolean retornoFeito = valores.ins(entrada);
		
		assertTrue(retornoFeito);
	}
	
	public void testeLower(){
		int entrada = 2;
		boolean retornoFeito = valores.ins(entrada);
		
		assertTrue(retornoFeito);
	}

}
