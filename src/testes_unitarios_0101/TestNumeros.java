package testes_unitarios_0101;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNumeros {
	
	//INSTANCIA
	Numeros n;

	@Before
	public void setUp() throws Exception {
		//ATRIBUINDO VALOR AO N
		n = new Numeros();
	}

	@Test
	public void testSoma() {
		//TIPO DE CASO | VALOR ESPERADO | REALIZAÇÃO DO METODO
		assertEquals("CASO 1: SOMA", 30, n.soma(10,20));
	}
	
	@Test
	public void testSoma2() {
		assertEquals("CASO 2: SOMA", 7, n.soma(2,5));
	}
	
	@Test
	public void testRaizCubica() {
		assertEquals("CASO 3: RAIZ CUBICA", 3, n.raizCubica(27),0);
	}
	
	@Test
	public void testRaziCubica() {
		assertEquals("CASO 4: RAIZ CUBICA", 2.71, n.raizCubica(20), 0.01);
	}
	
	@Test
	public void testFatorial() {
		assertEquals("CASO 5: FATORIAL", 120, n.fatorial(5), 0);
	}
	
	@Test
	public void testFatorial2() {
		assertEquals("CASO 6: FATORIAL", 1, n.fatorial(0), 0);
	}
	
	@Test
	public void testSomaIntervalo() {
		assertEquals("CASO 7: SOMA INTERVALO", 15, n.somaIntervalo(5),0);
	}
	
	@Test
	public void testSomaIntervalo2() {
		assertEquals("CASO 8: SOMA INTERVALO", 0, n.somaIntervalo(0),0);
	}

}
