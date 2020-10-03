package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.AsfaltoLiso;
import modelo.AsfaltoLomaDeBurro;
import modelo.AsfaltoPerrosFuriosos;
import modelo.Auto;
import modelo.CalleEmbarrada;
import modelo.Moto;
import modelo.Persona;
import modelo.Superficie;

class TestVelocidadMoto {

	@Test
	void testMotoCalleLisaDeberiaDevolver40() {
		
		Persona persona1 = new Persona();
		Moto moto1 = new Moto();
		Superficie sup1 =  new AsfaltoLiso();
		persona1.subirseA(moto1, sup1);
		double vel1 = persona1.getVelocidadDeVehiculo();
		assert (vel1 == 40);
		
	}
	
	@Test
	void testMotoEnCalleConPerrosDeberiaDevolver20() {
		Persona persona2 = new Persona();
		Moto moto2 = new Moto();
		Superficie sup2 = new AsfaltoPerrosFuriosos();
		persona2.subirseA(moto2, sup2);
		double vel2 = persona2.getVelocidadDeVehiculo();
		assert (vel2 == 20);
	}
	
	@Test
	void testMotoCalleConLomaDeBurroDeberiaDevolver20() {
		Persona persona3 = new Persona();
		Moto moto3 = new Moto();
		Superficie sup3 = new AsfaltoLomaDeBurro();
		persona3.subirseA(moto3, sup3);
		double vel3 = persona3.getVelocidadDeVehiculo();
		assert (vel3 == 20);
		}
	
	@Test
	void testAutoComunCalleEmbarradaDeberiaDevolver0() {
		Persona persona4 = new Persona();
		Moto moto4 = new Moto();
		Superficie sup4 = new CalleEmbarrada();
		persona4.subirseA(moto4, sup4);
		double vel4 = persona4.getVelocidadDeVehiculo();
		assert (vel4 == 0);
	}
}
