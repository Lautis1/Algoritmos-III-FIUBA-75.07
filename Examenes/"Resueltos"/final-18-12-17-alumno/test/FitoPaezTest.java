package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Instrumento;
import instrumentos.Madera;
import instrumentos.Material;
import instrumentos.Piano;
import instrumentos.Plastico;
import musicos.FitoPaez;
import musicos.Musico;

class FitoPaezTest {
	static FitoPaez fito = new FitoPaez();
	
	@Test
	void testFitoNoSabeTocarCharango() {
		Material madera = new Madera();
		Instrumento charango = new Charango(madera);
		assertEquals(0, fito.tocar(charango));
	}
	@Test
	void testFitoTocaPianoDeMaderaDevuelve150DB() {
		Material madera = new Madera();
		Piano piano = new Piano(madera);
		assertEquals(150, fito.tocar(piano));
	}
	@Test
	void testFitoNoSabeTocarGuitarra() {
		Material madera = new Madera();
		Instrumento guitarra = new GuitarraCriolla(madera);
		assertEquals(0, fito.tocar(guitarra));
	}
	@Test
	void testFitoTocaPianoDePlasticoDevuelve45DB() {
		Material plastico = new Plastico();
		Piano piano = new Piano(plastico);
		assertEquals(45, fito.tocar(piano));
	}

}
