package test;

import static org.junit.Assert.*;

import org.junit.Test;

import personajes.Bosque;
import personajes.Hacha;
import personajes.Herramienta;
import personajes.Lobo;
import personajes.Pulmones;
import personajes.TaladroRotopercutor;

public class BosqueTest {
	
		
	@Test
	public void elLoboQuiereAtacarSoplandoYDestruyeLaCasa() {
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);
		bosque.loboAtacarCasaDelChanchito();
		assertTrue(bosque.casaDestruida());
	}
	
	@Test
	public void elLoboQuiereAtacarCasaDeMaderaSoplandoYNoPuede() {
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);
		bosque.huirHaciaUnaCasaDeMadera();
		bosque.loboAtacarCasaDelChanchito();
		assertFalse(bosque.casaDestruida());
	}
	
	@Test
	public void elLoboQuiereAtacarCasaDeMaderaConHachaYPuede() {
		Lobo lobo = new Lobo();
		lobo.cambiarHerramienta(new Hacha());
		Bosque bosque = new Bosque(lobo);
		bosque.huirHaciaUnaCasaDeMadera();
		bosque.loboAtacarCasaDelChanchito();
		assertTrue(bosque.casaDestruida());	
	}
	
	@Test
	public void elLoboQuiereAtacarCasaDeCementoSoplandoYNoPuede() {
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);
		bosque.huirHaciaUnaCasaDeCemento();
		bosque.loboAtacarCasaDelChanchito();
		assertFalse(bosque.casaDestruida());
	}
	
	@Test
	public void elLoboQuiereAtacarCasaDeCementoConHachaYNoPuede() {
		Lobo lobo = new Lobo();
		lobo.cambiarHerramienta(new Hacha());
		Bosque bosque = new Bosque(lobo);
		bosque.huirHaciaUnaCasaDeCemento();
		bosque.loboAtacarCasaDelChanchito();
		assertFalse(bosque.casaDestruida());
	}
	
	@Test
	public void elLoboAtacaCasaDeCementoConTaladroYPuede() { //tambien puede romper las otras
		Lobo lobo = new Lobo();
		lobo.cambiarHerramienta(new TaladroRotopercutor());
		Bosque bosque = new Bosque(lobo);
		bosque.huirHaciaUnaCasaDeCemento();
		bosque.loboAtacarCasaDelChanchito();
		assertTrue(bosque.casaDestruida());
	}
	

}
