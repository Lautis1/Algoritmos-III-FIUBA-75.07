package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.Canion;
import modelo.Inteligente;
import modelo.NaveConCamuflaje;
import modelo.NaveEspacial;
import modelo.NaveSinCamuflaje;
import modelo.Normal;
import modelo.Propulsor;

public class NaveTest {
	
	@Test
	public void naveEspacialEmpiezaCon100DeVida() {
		
		//Sin camuflaje y propulsor normal
		Propulsor prop = new Propulsor(new Normal());
		NaveEspacial nave = new NaveConCamuflaje(prop, new Canion());
		assertEquals(100, nave.getVida());
		
		//Con camuflaje y propulsor inteligente
		Propulsor prop2 = new Propulsor(new Inteligente());
		NaveEspacial nave2= new NaveConCamuflaje(prop2, new Canion());
		assertEquals(100, nave2.getVida());
	}
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialSinCamuflajeProduciria25DeDanio() {
		
		//Nave con o sin camuflaje, ataca a otra sin camuflaje
		Propulsor prop = new Propulsor(new Normal());
		NaveEspacial atacante = new NaveSinCamuflaje(prop, new Canion());
		NaveEspacial enemiga = new NaveSinCamuflaje(prop, new Canion());
		atacante.atacar(enemiga);
		assertEquals(75, enemiga.getVida());
	}
	
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialConCamuflajeActivoNoProduciriaDanio() {
		
		//nave con o sin camuflaje, ataca a otra con camuflaje
		Propulsor prop = new Propulsor(new Normal());
		NaveEspacial atacante = new NaveConCamuflaje(prop, new Canion());
		NaveEspacial enemiga = new NaveConCamuflaje(prop, new Canion());
		atacante.atacar(enemiga);
		assertEquals(100, enemiga.getVida());
	}
	
	@Test
	public void naveEspacialSeDesplaza10UnidadesPorTurno() {
		
		//Nave con o sin camuflaje, con propulsor convencional
		Propulsor convencional = new Propulsor(new Normal());
		NaveEspacial nave = new NaveSinCamuflaje(convencional, new Canion());
		assertEquals(10, nave.moverse());
		
		
		//Nave con propulsor inteligente en modo normal
		Propulsor inteligente = new Propulsor(new Inteligente());
		NaveEspacial nave2 = new NaveSinCamuflaje(inteligente, new Canion());
		assertEquals(10, nave2.moverse());
		
		
	}
	
	@Test
	public void naveConPropulsorInteligenteTest() {
		
		Propulsor inteligente = new Propulsor(new Inteligente());
		NaveEspacial nave = new NaveSinCamuflaje(inteligente, new Canion());
		assertEquals(10, nave.moverse());
		assertEquals(20, nave.moverse());
		assertEquals(30, nave.moverse());
		assertEquals(40, nave.moverse());
		assertEquals(50, nave.moverse()); //aca paso a modo ahorro, se mueve 5 unidades
		
		assertEquals(55, nave.moverse());
		System.out.println(inteligente.getCombustible());
		//Le cargo 10 de combustible se mueve en modo normal
		nave.cargarCombustible(10);
		assertEquals(65, nave.moverse());
	}
}
