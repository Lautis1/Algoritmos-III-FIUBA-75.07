package test;

import org.junit.jupiter.api.Test;

import modelo.AsfaltoLiso;
import modelo.AsfaltoLomaDeBurro;
import modelo.AsfaltoPerrosFuriosos;
import modelo.Auto;
import modelo.Auto4x4;
import modelo.CalleEmbarrada;
import modelo.Persona;
import modelo.Superficie;

class TestVelocidadAuto {

	@Test
	void testAutoComunEnCalleLisaDeberiaDevolver40() {
		
		Persona persona1 = new Persona();
		Auto auto1 = new Auto();
		Superficie sup1 =  new AsfaltoLiso();
		persona1.subirseA(auto1, sup1);
		double vel1 = persona1.getVelocidadDeVehiculo();
		assert (vel1 == 40);
		
	}
	
	@Test
	void testAutoComunEnCalleConPerrosDeberiaDevolver40() {
		Persona persona2 = new Persona();
		Auto auto2 = new Auto();
		Superficie sup2 = new AsfaltoPerrosFuriosos();
		persona2.subirseA(auto2, sup2);
		double vel2 = persona2.getVelocidadDeVehiculo();
		assert (vel2 == 40);
	}
	
	@Test
	void testAutoComunCalleConLomaDeBurroDeberiaDevolver20() {
		Persona persona3 = new Persona();
		Auto auto3 = new Auto();
		Superficie sup3 = new AsfaltoLomaDeBurro();
		persona3.subirseA(auto3, sup3);
		double vel3 = persona3.getVelocidadDeVehiculo();
		assert (vel3 == 20);
		}
	
	@Test
	void testAutoComunCalleEmbarradaDeberiaDevolver0() {
		Persona persona4 = new Persona();
		Auto auto4 = new Auto();
		Superficie sup4 = new CalleEmbarrada();
		persona4.subirseA(auto4, sup4);
		double vel4 = persona4.getVelocidadDeVehiculo();
		assert (vel4 == 0);
	}
	
	@Test
	void testAuto4x4CalleEmbarradaDeberiaDevolver10() {
		Persona persona5 = new Persona();
		Auto4x4 auto5 = new Auto4x4();
		Superficie sup5 = new CalleEmbarrada();
		persona5.subirseA(auto5, sup5);
		double vel5 = persona5.getVelocidadDeVehiculo();
		assert (vel5 == 10);
	}
}
