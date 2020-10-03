package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.AsfaltoLiso;
import modelo.AsfaltoLomaDeBurro;
import modelo.AsfaltoPerrosFuriosos;
import modelo.Caballo;
import modelo.CalleEmbarrada;
import modelo.Persona;
import modelo.Superficie;

class TestVelocidadCaballo {

	@Test
	void unCaballoTieneVelocidad20EnTodaSuperficie() {
		
		Caballo caballo = new Caballo();
		Persona persona1 = new Persona();
		
		Superficie sup1 = new AsfaltoLiso();
		Superficie sup2 = new AsfaltoLomaDeBurro();
		Superficie sup3 = new AsfaltoPerrosFuriosos();
		Superficie sup4 = new CalleEmbarrada();
		
		persona1.subirseA(caballo, sup1);
		double vel1 = persona1.getVelocidadDeVehiculo();
		assert (vel1 == 20);
		
		persona1.subirseA(caballo, sup2);
		double vel2 = persona1.getVelocidadDeVehiculo();
		assert (vel2 == 20);
		
		persona1.subirseA(caballo, sup3);
		double vel3 = persona1.getVelocidadDeVehiculo();
		assert (vel3 == 20);
		
		persona1.subirseA(caballo, sup4);
		double vel4 = persona1.getVelocidadDeVehiculo();
		assert (vel4 == 20);
		
		
	}

}
