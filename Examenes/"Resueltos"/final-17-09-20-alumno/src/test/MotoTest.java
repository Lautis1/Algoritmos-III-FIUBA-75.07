package test;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import modelo.Helatodo;
import modelo.Moto;
import modelo.MotoNoPuedeCargarPortaBiciError;
import modelo.Portabici;

public class MotoTest {
	
	@Test
	public void MotoPuedeCargarHeladeritaYAlDescargarDebeSacarLaHeladerita() {
		Moto moto = new Moto();
		Helatodo heladerita = new Helatodo();
		moto.cargar(heladerita);
		assertSame(heladerita, moto.descargar());
	}
	
	@Test 
	public void MotoNoPuedeCargarPortaBici() {
		Moto moto = new Moto();
		Portabici portabici = new Portabici();
		assertThrows(MotoNoPuedeCargarPortaBiciError.class, () -> moto.cargar(portabici));		
	}
	
}
