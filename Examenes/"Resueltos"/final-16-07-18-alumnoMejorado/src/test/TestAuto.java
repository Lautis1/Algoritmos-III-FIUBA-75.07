package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.AsfaltoLiso;
import modelo.AsfaltoLomaDeBurro;
import modelo.AsfaltoPerrosFuriosos;
import modelo.Auto;
import modelo.CalleEmbarrada;
import modelo.Persona;
import modelo.Superficie;
import modelo.Vehiculo;

public class TestAuto {
	
	public Persona persona = new Persona();
	public Vehiculo auto = new Auto();
	
	
	@Test
	public void AutoCirculaEnCalleEmbarradaYSuVelocidadEsDe0() {
		persona.subirseA(auto);
		Superficie calle = new CalleEmbarrada();
		assertEquals(0, persona.getVelocidadDeVehiculo(calle));
	}
	
	@Test
	public void AutoCirculaEnAsfaltoListoYSuVelocidadEsDe40() {
		persona.subirseA(auto);
		Superficie asfalto = new AsfaltoLiso();
		assertEquals(40, persona.getVelocidadDeVehiculo(asfalto));
	}
	
	@Test
	public void AutoCirculaEnAsfaltoConPerrosYSuVelocidadEsDe40() {
		persona.subirseA(auto);
		Superficie asfaltoPerros = new AsfaltoPerrosFuriosos();
		assertEquals(40, persona.getVelocidadDeVehiculo(asfaltoPerros));
	}
	
	@Test
	public void AutoCirculaEnAsfaltoConLomaDeBurroYSuVelocidadEsDe20() {
		persona.subirseA(auto);
		Superficie asfaltoLoma = new AsfaltoLomaDeBurro();
		assertEquals(20, persona.getVelocidadDeVehiculo(asfaltoLoma));
	}
	

}
