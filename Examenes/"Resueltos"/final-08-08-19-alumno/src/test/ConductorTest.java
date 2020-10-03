package test;

import org.junit.Assert;
import org.junit.Test;

import main.Auto;
import main.ConCasco;
import main.ConCinturon;
import main.Conductor;
import main.EstadoDeCirculacion;
import main.Moto;
import main.SinCasco;
import main.SinCinturon;
import main.Vehiculo;

public class ConductorTest {

	
	/****************************************************************************************
	 * MOTO TEST
	 ****************************************************************************************/
	Vehiculo moto = new Moto();
	EstadoDeCirculacion est1 = new SinCasco();
	EstadoDeCirculacion est2 = new ConCasco();
	
	@Test
	public void testManejoUnaMotoSinCascoNoDeberiaPoderCircular() {
		
		Conductor conductor = new Conductor(moto,est1);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoDeberiaPoderCircular() {
		
		Conductor conductor = new Conductor(moto, est2);
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoYMultasNoDeberiaPoderCircular() {
		
		Conductor conductor = new Conductor(moto,est2);
		conductor.agregarInfraccion(100);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoAgregoUnaMultaLuegoLaPagoDeberiaPoderCircular() {
		
		Conductor conductor = new Conductor(moto,est2);
		conductor.agregarInfraccion(100);
		conductor.pagarInfraccion(100);
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	
	
	/****************************************************************************************
	 * AUTO TEST
	 ****************************************************************************************/
	Vehiculo auto = new Auto();
	EstadoDeCirculacion est3 = new ConCinturon();
	EstadoDeCirculacion est4 = new SinCinturon();
	
	@Test
	public void testManejoUnAutoSinCinturonAbrochadoNoDeberiaPoderCircular() {
		
		Conductor conductor = new Conductor(auto, est4);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadoDeberiaPoderCircular() {
		
		Conductor conductor = new Conductor(auto, est3);
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadoYMultasNoDeberiaPoderCircular() {
		
		Conductor conductor = new Conductor(auto, est3);
		conductor.agregarInfraccion(100);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadAgregoUnaMultaLuegoLaPagoDeberiaPoderCircular() {
		
		Conductor conductor = new Conductor(auto, est3);
		conductor.agregarInfraccion(250);
		conductor.pagarInfraccion(250);
		Assert.assertTrue(conductor.puedoCircular());
	}
}
