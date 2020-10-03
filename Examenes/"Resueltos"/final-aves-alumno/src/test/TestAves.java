package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.AbelPintos;
import modelo.Avestruz;
import modelo.Gorrion;
import modelo.Superficie;
import modelo.SuperficieBarro;
import modelo.SuperficieHielo;
import modelo.SuperficiePista;

class TestAves {

	@Test
	void testAvestruzNoPuedeCorrerSobreHielo() {
		
		Avestruz aves = new Avestruz();
		Superficie hielo = new SuperficieHielo();
		assertEquals(0, aves.correr(hielo));
	}
	@Test
	void testAvestruzCorreA70kmhPorBarro() {
		
		Avestruz ave = new Avestruz();
		Superficie barro = new SuperficieBarro();
		assertEquals(70, ave.correr(barro));
	}
	
	@Test
	void testGorrionCantaPioPio() {
		
		Gorrion pajarito = new Gorrion();
		assertEquals("pio pio", pajarito.cantar());
	}
	
	@Test
	void testGorrionVuelaA50kmh() {
		
		Gorrion pajarito = new Gorrion();
		assertEquals(50, pajarito.volar());
	}
	
	@Test
	void testAbelPintosCorreA15kmhEnPista() {
		
		AbelPintos abel = new AbelPintos();
		Superficie pista = new SuperficiePista();
		assertEquals(15, abel.correr(pista));
	}
	@Test
	void testAbelCantaLaLlave() {
		
		AbelPintos abel = new AbelPintos();
		assertEquals("vas a entrar sin pedirme la llave...", abel.cantar());
	}
	@Test
	void testAbelNoCorreEnHielo() {
		
		AbelPintos abel = new AbelPintos();
		Superficie hielo = new SuperficieHielo();
		assertEquals(0, abel.correr(hielo));
	}

}
