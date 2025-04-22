package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cilindro;

class TestCilindro {

	@Test
	void testSuperficie() {
		Cilindro c = new Cilindro(1,1);
		double superficieObtenida = c.superficie();
		superficieObtenida = c.superficie();
		double superficieEsperada = 12.56;
		assertEquals(superficieEsperada,superficieObtenida);
	}

	@Test
	void testVolumen() {
		Cilindro c = new Cilindro(1,1);
		double volumenObtenido = c.volumen();
		volumenObtenido = c.volumen();
		double volumenEsperado = 3.14;
		assertEquals(volumenEsperado,volumenObtenido);
	}

}
