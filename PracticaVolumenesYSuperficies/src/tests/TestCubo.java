package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cubo;

class TestCubo {

	@Test
	void testSuperficie() {
		Cubo c = new Cubo(1);
		double superficieObtenida = c.superficie();
		superficieObtenida = Math.round(c.superficie());
		double superficieEsperada = 6;
		assertEquals(superficieEsperada,superficieObtenida);
	}

	@Test
	void testVolumen() {
		Cubo c = new Cubo(1);
		double volumenObtenido = c.volumen();
		volumenObtenido = Math.round(c.volumen());
		double volumenEsperado = 1;
		assertEquals(volumenEsperado,volumenObtenido);
	}

}
