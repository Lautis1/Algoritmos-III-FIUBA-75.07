package test;

import org.junit.Assert;
import org.junit.Test;

import main.Auto;
import main.Conductor;
import main.EstadoConduccion;
import main.Moto;
import main.SinCasco;
import main.SinCinturon;
import main.Vehiculo;

public class ConductorTest {
	
	static final EstadoConduccion sinCinturon = new SinCinturon();
	
	/****************************************************************************************
	 * MOTO TEST
	 ****************************************************************************************/
	
	@Test
	public void testManejoUnaMotoSinCascoNoDeberiaPoderCircular() {
		EstadoConduccion sinCasco = new SinCasco();
		Conductor conductor = new Conductor(new Moto(), sinCasco);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoDeberiaPoderCircular() {
		EstadoConduccion sinCasco = new SinCasco();
		Conductor conductor = new Conductor(new Moto(), sinCasco);
		conductor.ponerseElCasco();
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoYMultasNoDeberiaPoderCircular() {
		EstadoConduccion sinCasco = new SinCasco();
		Conductor conductor = new Conductor(new Moto(), sinCasco);
		conductor.ponerseElCasco();
		conductor.agregarInfraccion(100);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoAgregoUnaMultaLuegoLaPagoDeberiaPoderCircular() {
		EstadoConduccion sinCasco = new SinCasco();
		Conductor conductor = new Conductor(new Moto(), sinCasco);
		conductor.ponerseElCasco();
		conductor.agregarInfraccion(100);
		conductor.pagarInfraccion(100);
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	
	
	/****************************************************************************************
	 * AUTO TEST
	 ****************************************************************************************/
	
	@Test
	public void testManejoUnAutoSinCinturonAbrochadoNoDeberiaPoderCircular() {
		
		Conductor conductor = new Conductor(new Auto(), sinCinturon);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto(), sinCinturon);
		// Abrochate a la vida !!!
		conductor.abrocharseElCinturon();
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadoYMultasNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto(), sinCinturon);
		conductor.abrocharseElCinturon();
		conductor.agregarInfraccion(100);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadAgregoUnaMultaLuegoLaPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto(), sinCinturon);
		conductor.abrocharseElCinturon();
		conductor.agregarInfraccion(250);
		conductor.pagarInfraccion(250);
		Assert.assertTrue(conductor.puedoCircular());
	}
}
