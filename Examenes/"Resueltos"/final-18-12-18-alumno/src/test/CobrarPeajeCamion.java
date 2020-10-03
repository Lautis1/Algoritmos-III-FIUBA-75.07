package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.CabinaDePeaje;
import modelo.Camion;
import modelo.ConTelepase;
import modelo.EstadoTelepase;
import modelo.SinTelepase;
import modelo.Transporte;

class CobrarPeajeCamion {
	static CabinaDePeaje cab = new CabinaDePeaje();
	
	@Test
	void testPeajeACamionSinTelepaseCuesta36() {
		EstadoTelepase telepase = new SinTelepase();
		Transporte camion = new Camion(telepase);
		assertEquals(36, cab.cobrarPeaje(camion));
	}
	@Test
	void testPeajeACamionConTelepaseCuesta9() { //un cuarto menos que sin telepase
		EstadoTelepase telepase = new ConTelepase();
		Transporte camion = new Camion(telepase);
		assertEquals(9-1, cab.cobrarPeaje(camion));
	}

}
