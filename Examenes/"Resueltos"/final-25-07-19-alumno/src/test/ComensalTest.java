package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import comensales.Celiaco;
import comensales.Comensal;
import comensales.ComensalCeliacoError;
import comensales.ComensalHipertensoError;
import comensales.NoCeliaco;
import comidas.Comida;
import comidas.Empanada;
import comidas.EmpanadaCeliaca;
import comidas.Pan;
import especialistas.Empanadero;
import especialistas.Especialista;
import especialistas.Panadero;

class ComensalTest {

	@Test
	void testComensalCeliacoComeEmpanadaCeliacaConsume15Cal() throws ComensalCeliacoError, ComensalHipertensoError {
		
		Comensal com = new Celiaco();
		Especialista empanadero = new Empanadero("celiaco");
		EmpanadaCeliaca emp = (EmpanadaCeliaca) empanadero.cocinar();
		com.comer(emp);
		assertEquals(15, com.getCalorias());
	}
	@Test
	void testComensalCeliacoComePanComunDebeLanzarExcepcion() throws ComensalCeliacoError, ComensalHipertensoError {
		
		Comensal com = new Celiaco();
		Especialista panadero = new Panadero("");
		Pan pan = (Pan) panadero.cocinar();
		assertThrows(ComensalCeliacoError.class,()-> com.comer(pan));
	}
	@Test
	void testComensalComePanYEmpanadaConsume25Cal() throws ComensalCeliacoError, ComensalHipertensoError {
		
		Comensal com = new NoCeliaco();
		Especialista panadero = new Panadero("");
		Especialista emp = new Empanadero("");
		Pan pan = (Pan) panadero.cocinar();
		Empanada empa = (Empanada) emp.cocinar();
		com.comer(pan);
		com.comer(empa);
		assertEquals(25, com.getCalorias());
	}

}
