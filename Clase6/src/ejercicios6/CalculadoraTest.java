package ejercicios6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void multiplicartest() {
		double n=80;
		double m=3;
		assertEquals(Calculadora.multiplicar(n,m),240);
	}
	
	@Test
	void dividirsumatest() {
		double n=150;
		double m=180;
		double o=3;
		assertEquals(Calculadora.dividir(Calculadora.sumar(n,m),o),110);
	}
	
	@Test
	void multiplicarrestatest() {
		double n=90;
		double m=50;
		double o=15;
		assertFalse(Calculadora.multiplicar(Calculadora.restar(n,m),o)==605);
	}
	
	@Test
	void multiplicarsumat() {
		double n=70;
		double m=40;
		double o=25;
		assertFalse(Calculadora.multiplicar(Calculadora.sumar(n,m),o)==2700);
	}

}
