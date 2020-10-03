package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import modelo.NaveConCamuflaje;
import modelo.NaveEspacial;
import modelo.NaveSinCamuflaje;
import modelo.Propulsor;
import modelo.PropulsorConvencional;
import modelo.PropulsorInteligente;

public class NaveEspacialTest {
	
	@Test
	public void naveEspacialEmpiezaCon100DeVida() {
		
		//Con camuflaje y propulsor convencional
		Propulsor prop = new PropulsorConvencional();
		NaveEspacial naveCC = new NaveConCamuflaje(prop);
		assertEquals(100, naveCC.getVida());
		
		//Con camuflaje y propulsor inteligente
		Propulsor prop2 = new PropulsorInteligente();
		NaveEspacial naveCC2 = new NaveConCamuflaje(prop2);
		assertEquals(100, naveCC2.getVida());
	}
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialSinCamuflajeProduciria25DeDanio() {
		
		//Nave con o sin camuflaje, ataca a otra sin camuflaje
		Propulsor prop = new PropulsorConvencional();
		NaveEspacial atacante = new NaveSinCamuflaje(prop);
		NaveEspacial enemiga = new NaveSinCamuflaje(prop);
		atacante.atacar(enemiga);
		assertEquals(75, enemiga.getVida());
	}
	
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialConCamuflajeActivoNoProduciriaDanio() {
		
		//nave con o sin camuflaje, ataca a otra con camuflaje
		Propulsor prop = new PropulsorConvencional();
		NaveEspacial atacante = new NaveConCamuflaje(prop);
		NaveEspacial enemiga = new NaveConCamuflaje(prop);
		atacante.atacar(enemiga);
		assertEquals(100, enemiga.getVida());
	}
	
	@Test
	public void naveEspacialSeDesplaza10UnidadesPorTurno() {
		
		//Nave con o sin camuflaje, con propulsor convencional
		Propulsor convencional = new PropulsorConvencional();
		NaveEspacial nave = new NaveSinCamuflaje(convencional);
		assertEquals(10, nave.moverse());
		
		
		//Nave con propulsor inteligente en modo normal
		Propulsor inteligente = new PropulsorInteligente();
		NaveEspacial nave2 = new NaveSinCamuflaje(inteligente);
		assertEquals(10, nave2.moverse());
		
		
	}
	
	@Test
	public void naveConPropulsorInteligenteTest() {
		
		Propulsor inteligente = new PropulsorInteligente();
		NaveEspacial nave = new NaveSinCamuflaje(inteligente);
		assertEquals(10, nave.moverse());
		assertEquals(20, nave.moverse());
		assertEquals(30, nave.moverse());
		assertEquals(40, nave.moverse());
		assertEquals(50, nave.moverse()); //aca paso a modo ahorro, se mueve 5 unidades
		
		assertEquals(55, nave.moverse());
		System.out.println(inteligente.getNivelDeCombustible());
	}
	
	
}
