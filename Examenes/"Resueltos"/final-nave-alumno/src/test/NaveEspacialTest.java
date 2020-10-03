package test;

import org.junit.Assert;
import org.junit.Test;

import factories.NaveFactory;
import naves.Atacable;
import naves.Movible;

public class NaveEspacialTest {
	
	@Test
	public void test01naveEspacialEmpiezaCon100DeVida() {
		
		NaveFactory fabrica = new NaveFactory ();
		Atacable naveBasica = fabrica.crearNaveBasica();
		
		Assert.assertTrue(naveBasica.tieneVida(100));
	}
	

	@Test
	public void test02naveEspacialAtacaOtraNaveEspacialSinCamuflajeProduciria25DeDanio() {
		
		// 1. Arrange
		NaveFactory fabrica = new NaveFactory ();
		Atacable naveBasica1 = fabrica.crearNaveBasica();
		Atacable naveBasica2 = fabrica.crearNaveBasica();

		// 2. Act
		naveBasica1.atacar(naveBasica2);
		
		
		// 3. Assert
		Assert.assertTrue(naveBasica2.tieneVida(75));
	}
	
	@Test
	public void test03naveEspacialAtacaOtraNaveEspacialConCamuflajeInactivoProduciria25DeDanio() {
		
		NaveFactory fabrica = new NaveFactory ();
		Atacable naveBasica = fabrica.crearNaveBasica();
		Atacable naveCamuflada = fabrica.crearNaveCamuflada();		
		naveCamuflada.desactivarCamuflaje();		


		naveBasica.atacar(naveCamuflada);
		
		
		Assert.assertTrue(naveCamuflada.tieneVida(75));
	}
	
	
	@Test
	public void test04naveEspacialAtacaOtraNaveEspacialConCamuflajeActivoNoProduciriaDanio() {
		
		NaveFactory fabrica = new NaveFactory ();
		Atacable naveBasica = fabrica.crearNaveBasica();
		Atacable naveCamuflada = fabrica.crearNaveCamuflada();				

		naveBasica.atacar(naveCamuflada);
		
		
		Assert.assertTrue(naveCamuflada.tieneVida(100));
	}
	
	@Test
	public void test05naveEspacialConPropulsorComunSeDesplaza10UnidadesPorTurno() {
		
		NaveFactory fabrica = new NaveFactory ();
		Movible naveBasica = fabrica.crearNaveBasica();
		int unidadesDesplazadasEsperadas = 10;

		int unidadesDesplazadas = naveBasica.moverse();		
		
		Assert.assertEquals(unidadesDesplazadas,unidadesDesplazadasEsperadas);
	}
	
	@Test
	public void test06naveEspacialComunAlDesplazarseUnTurnoGastaria10UnidadesDeCombustible() {
		
		NaveFactory fabrica = new NaveFactory ();
		Movible naveBasica = fabrica.crearNaveBasica();

		naveBasica.moverse();		
		
		Assert.assertTrue(naveBasica.tieneCombustible(90));
	}
	
	@Test
	public void test07naveEspacialConPropulsorInteligenteSeDesplaza10UnidadesPorTurnoInicialmente () {
		
		NaveFactory fabrica = new NaveFactory ();
		Movible naveConPropulsorInteligente = fabrica.crearNaveConPropulsorInteligente();
		int unidadesDesplazadasEsperadas = 10;

		int unidadesDesplazadas = naveConPropulsorInteligente.moverse();		
		
		Assert.assertEquals(unidadesDesplazadas,unidadesDesplazadasEsperadas);

	}
	
	@Test
	public void test08naveEspacialConPropulsorInteligenteGasta10UnidadesDeCombustibleInicialmente () {
		
		NaveFactory fabrica = new NaveFactory ();
		Movible naveConPropulsorInteligente = fabrica.crearNaveConPropulsorInteligente();

		naveConPropulsorInteligente.moverse();		
		
		Assert.assertTrue(naveConPropulsorInteligente.tieneCombustible(90));

	}
	
	@Test
	public void test09naveEspacialConPropulsorInteligenteSeDesplaza5UnidadesPorTurnoEnModoAhorro () {
		NaveFactory fabrica = new NaveFactory ();
		Movible naveConPropulsorInteligente = fabrica.crearNaveConPropulsorInteligente();
		//muevo la nave 5 veces para que quede con 50 de combustible
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();	
		//con 50 de combustible deberia desplazarse 5 unidades
		int unidadesDesplazadasEsperadas = 5;

		int unidadesDesplazadas = naveConPropulsorInteligente.moverse();		
		
		Assert.assertEquals(unidadesDesplazadas,unidadesDesplazadasEsperadas);

	}
	
	@Test
	public void test10naveEspacialConPropulsorInteligenteGasta5UnidadesDeCombustibleEnModoAhorro () {
		NaveFactory fabrica = new NaveFactory ();
		Movible naveConPropulsorInteligente = fabrica.crearNaveConPropulsorInteligente();
		//muevo la nave 5 veces para que quede con 50 de combustible
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();	

		naveConPropulsorInteligente.moverse();		
		
		Assert.assertTrue(naveConPropulsorInteligente.tieneCombustible(45));

	}
	
	@Test
	public void test11naveEspacialConPropulsorInteligenteVuelveADesplazarseComoAntesSiCargaSuficientecombustible () {
		NaveFactory fabrica = new NaveFactory ();
		Movible naveConPropulsorInteligente = fabrica.crearNaveConPropulsorInteligente();
		//muevo la nave 5 veces para que quede con 50 de combustible
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();	
		//cargo 10 de combustible
		naveConPropulsorInteligente.cargarCombustible(10);
		//con 60 de combustible deberia desplazarse 10 unidades
		int unidadesDesplazadasEsperadas = 10;

		int unidadesDesplazadas = naveConPropulsorInteligente.moverse();		
		
		Assert.assertEquals(unidadesDesplazadas,unidadesDesplazadasEsperadas);

	}

	@Test
	public void test12naveEspacialConPropulsorInteligenteVuelveAConsumir10DeCombustibleSiCargaSuficientecombustible () {
		NaveFactory fabrica = new NaveFactory ();
		Movible naveConPropulsorInteligente = fabrica.crearNaveConPropulsorInteligente();
		//muevo la nave 5 veces para que quede con 50 de combustible
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();
		naveConPropulsorInteligente.moverse();	
		//cargo 10 de combustible
		naveConPropulsorInteligente.cargarCombustible(10);	

		naveConPropulsorInteligente.moverse();	
		
		//con 60 de combustible deberia gastar 10 unidades
		Assert.assertTrue(naveConPropulsorInteligente.tieneCombustible(50));
	}

}
