package br.mackenzie.testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.mackenzie.Calculadora;

class CalculadoraTest {

	Calculadora calc = new Calculadora();

	@Test
	public void testeSoma() {
		System.out.println("Testando a Soma");
		assertEquals(2.0, calc.somar(1.0, 1.0));
		assertEquals(15.2, calc.somar(10.0, 5.2));
		assertEquals(80.21, calc.somar(40.0, 40.21), 0.001);
		assertEquals(13.31, calc.somar(8.54, 4.77), 0.001);
		assertNotEquals(2.0, calc.somar(2.0, 3.0));
		assertNotEquals(52.0, calc.somar(2.0, 58.0));
		assertNotEquals(333.0, calc.somar(111.0, 555.0));
	}

	@Test
    public void testSubtrair() {
        System.out.println("Testando a Subtração");
        assertEquals(2.0, calc.subtrair(3.0, 1.0));
        assertEquals(10.2, calc.subtrair(15.4, 5.2));
        assertEquals(32.5, calc.subtrair(58.9, 26.4));
        assertNotEquals(6.0, calc.subtrair(9.0, 3.1));
        assertNotEquals(5.8, calc.subtrair(99.7, 150.5)); 
        assertNotEquals(22.22, calc.subtrair(64.11, 25.58)); 
    }

    @Test
    public void testMultiplicar() {
        System.out.println("Testando a Multiplicação");
        assertEquals(2.0, calc.multiplicar(2.0, 1.0));
        assertEquals(10.2, calc.multiplicar(2.0, 5.1));
        assertEquals(32.6, calc.multiplicar(8.15, 4.0));
        assertNotEquals(6.0, calc.multiplicar(3.0, 2.1));
        assertNotEquals(5.7, calc.multiplicar(100.7, 2.45)); 
        assertNotEquals(49.7, calc.multiplicar(4.58, 5.8)); 
    }

    @Test
    public void testDividir() {
        System.out.println("Testando a Divisão");
        assertEquals(2.0, calc.dividir(4.0, 2.0));
        assertEquals(9.78, calc.dividir(48.9, 5.0));
        assertEquals(48.3, calc.dividir(170.982, 3.54));
        assertNotEquals(6.1, calc.dividir(12.0, 2.0));
        assertNotEquals(48.7, calc.dividir(100.7, 5.87)); 
        assertNotEquals(29.47, calc.dividir(4.7, 1.87));
    }

}
