package testes_unitarios_0102;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteIMC {
	imc meuIMC;
	@Before
	public void setUp() throws Exception {
		meuIMC = new imc();
	}

	@Test
	public void testIMCAbaixoDe20() {
		assertEquals("Caso 01: ", "Abaixo do peso", meuIMC.IMC(19,1));
	}

	@Test
	public void testIMCEntre20E25() {
		assertEquals("Caso 02: ", "Peso normal", meuIMC.IMC(24,1));
	}
	
	@Test
	public void testIMCEntre25E30() {
		assertEquals("Caso 03: ", "Sobre peso", meuIMC.IMC(26,1));
	}
	
	@Test
	public void testIMCEntre30E40() {
		assertEquals("Caso 04: ", "Obeso", meuIMC.IMC(35,1));
	}
	
	@Test
	public void testIMCAcimaDe40() {
		assertEquals("Caso 05: ", "Obeso mórbido", meuIMC.IMC(50,1));
	}
}
