package br.mackenzie.testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.mackenzie.voto.Eleitor;

class EleitorTest {

	Eleitor objEleitor = new Eleitor();
	
	@Test
	public void testeClassificaEleitorInvalido() {
		System.out.println("Teste de classificação da idade inválida");
		assertEquals("Idade inválida", objEleitor.classificaEleitor(-1));
		assertEquals("Idade inválida", objEleitor.classificaEleitor(131));
		assertEquals("Idade inválida", objEleitor.classificaEleitor(-250));
	}
	
	@Test
	public void testClassificaEleitorNaoPermitido() {
		System.out.println("Teste de classificação da idade não permtida");
		assertEquals("Não permitido", objEleitor.classificaEleitor(0));
		assertEquals("Não permitido", objEleitor.classificaEleitor(1));
		assertEquals("Não permitido", objEleitor.classificaEleitor(14));
		assertEquals("Não permitido", objEleitor.classificaEleitor(15));
	}
	
	@Test
	public void testClassificaEleitorFacultativo() {
		System.out.println("Teste de classificação da idade facultativa");
		assertEquals("Facultativo", objEleitor.classificaEleitor(16));
		assertEquals("Facultativo", objEleitor.classificaEleitor(17));
		assertEquals("Facultativo", objEleitor.classificaEleitor(70));
		assertEquals("Facultativo", objEleitor.classificaEleitor(71));
		assertEquals("Facultativo", objEleitor.classificaEleitor(129));
		assertEquals("Facultativo", objEleitor.classificaEleitor(130));		
	}
	
	@Test
	public void testClassificaEleitorObrigatório() {
		System.out.println("Teste de classificação da idade obrigatória");
		assertEquals("Obrigatório", objEleitor.classificaEleitor(18));
		assertEquals("Obrigatório", objEleitor.classificaEleitor(19));
		assertEquals("Obrigatório", objEleitor.classificaEleitor(36));
		assertEquals("Obrigatório", objEleitor.classificaEleitor(68));
		assertEquals("Obrigatório", objEleitor.classificaEleitor(69));
	}

}
