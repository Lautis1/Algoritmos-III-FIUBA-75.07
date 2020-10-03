package test;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import modelo.Auto;
import modelo.AutoNoPoseePortaBiciError;
import modelo.Bicicleta;
import modelo.Helatodo;
import modelo.Portabici;

public class AutoTest {
	
	@Test
	public void AutoPuedeCargarHeladeritaYAlDescargarDebeSacarLaHeladerita() {
		Auto auto = new Auto();
		Helatodo heladerita = new Helatodo();
		auto.cargar(heladerita);
		assertSame(heladerita, auto.descargar());
	}
	
	@Test 
	public void AutoNoPuedeCargarBicicletaSinHaberCargadoPortaBici() {
		Auto auto = new Auto();
		Bicicleta bici = new Bicicleta();
		assertThrows(AutoNoPoseePortaBiciError.class, () -> auto.cargar(bici));		
	}
	
	@Test
	public void AutoPuedeCargarBicicletaCuandoTienePortaBiciYAlDescargarSacaLaBici() {
		Auto auto = new Auto();
		Bicicleta bici = new Bicicleta();
		Portabici portabici = new Portabici();
		auto.cargar(portabici);
		auto.cargar(bici);
		assertSame(bici, auto.descargar());
	}

}
