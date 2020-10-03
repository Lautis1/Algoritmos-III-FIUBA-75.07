package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.AsfaltoLiso;
import modelo.AsfaltoPerrosFuriosos;
import modelo.CalleEmbarrada;
import modelo.Moto;
import modelo.Persona;
import modelo.Superficie;
import modelo.Vehiculo;

public class TestMoto {
	
	Vehiculo moto = new Moto();
	Persona persona = new Persona();
	
	@Test
	public void MotoNoPuedeCircularPorCalleEmbarrada() {
		
		persona.subirseA(moto);
		Superficie calle = new CalleEmbarrada();
		assertEquals(0, persona.getVelocidadDeVehiculo(calle));
	}
	
	@Test
	public void MotoCirculaPorAsfaltoLisoA40km() {
		
		persona.subirseA(moto);
		Superficie asfalto = new AsfaltoLiso();
		assertEquals(40, persona.getVelocidadDeVehiculo(asfalto));
	}
	
	@Test
	public void MotoCirculaPorAsfaltoConPerrosA20km() {
		
		persona.subirseA(moto);
		Superficie asfaltoPerros = new AsfaltoPerrosFuriosos();
		assertEquals(20, persona.getVelocidadDeVehiculo(asfaltoPerros));
	}

}
