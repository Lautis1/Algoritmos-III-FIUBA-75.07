package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Auto;
import modelo.CabinaDePeaje;
import modelo.ConTelepase;
import modelo.EstadoTelepase;
import modelo.SinTelepase;
import modelo.Transporte;

class CobrarPeajeAutoTest {
	static CabinaDePeaje cab = new CabinaDePeaje();
	
	@Test
	void testPeajeAAutoSinTelepaseCuesta8() {
		EstadoTelepase telepase = new SinTelepase();
		Transporte auto = new Auto(telepase);
		assertEquals(8, cab.cobrarPeaje(auto));
	}
	
	@Test
	void testPeajeAAutoConTelepaseCuesta4() {
		EstadoTelepase telepase = new ConTelepase();
		Transporte auto = new Auto(telepase);
		assertEquals(4, cab.cobrarPeaje(auto));
	}

}
