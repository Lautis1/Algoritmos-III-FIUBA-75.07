package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.CabinaDePeaje;
import modelo.Moto;
import modelo.Transporte;

class CobrarPeajeMotoTest {

	@Test
	void testPeajeAMotoCuesta4() {
		CabinaDePeaje cab = new CabinaDePeaje();
		Transporte moto = new Moto();
		assertEquals(4, cab.cobrarPeaje(moto));
	}

}
