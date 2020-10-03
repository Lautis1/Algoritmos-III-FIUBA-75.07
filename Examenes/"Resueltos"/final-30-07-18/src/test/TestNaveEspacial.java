package test;

import org.junit.Assert;
import org.junit.Test;

import modelo.NaveConCamuflajeActivo;
import modelo.NaveEspacial;
import modelo.NaveSinCamuflaje;
import modelo.Propulsor;
import modelo.PropulsorTanqueLleno;

public class TestNaveEspacial {
	
	@Test
	public void naveEspacialSinCamuflajeEmpiezaCon100DeVida() {
		
		Propulsor prop = new PropulsorTanqueLleno();
		NaveEspacial nave = new NaveSinCamuflaje(prop);
		Assert.assertEquals(100, nave.getVida());		
	}
	@Test
	public void naveConCamuflajeEmpiezaCon100DeVida() {
		
		Propulsor prop = new PropulsorTanqueLleno();
		NaveEspacial nave = new NaveConCamuflajeActivo(prop);
		Assert.assertEquals(100, nave.getVida());
	}
	@Test
	public void naveAtacaANaveSinCamuflajeDevuelve75DeVida() {
		
		Propulsor prop = new PropulsorTanqueLleno();
		NaveEspacial nave = new NaveSinCamuflaje(prop);
		NaveEspacial naveEnemiga = new NaveSinCamuflaje(prop);
		nave.atacar(naveEnemiga);
		Assert.assertEquals(75, naveEnemiga.getVida());
	}
	@Test
	public void naveAtacaANaveConCamuflajeNoLeQuitaVida() {
		
		Propulsor prop = new PropulsorTanqueLleno();
		NaveEspacial nave = new NaveConCamuflajeActivo(prop);
		NaveEspacial naveEnemiga = new NaveConCamuflajeActivo(prop);
		nave.atacar(naveEnemiga);
		Assert.assertEquals(100, naveEnemiga.getVida());
	}
	@Test
	public void naveSeMueveYSeDesplaza10posiciones() {
		
		Propulsor prop = new PropulsorTanqueLleno();
		NaveEspacial nave = new NaveSinCamuflaje(prop);
		Assert.assertEquals(0, nave.getPosicionActual());
		nave.moverse();
		Assert.assertEquals(10, nave.getPosicionActual());
	}
	@Test
	public void AlMoverLaNaveSeGastan10UnidadesDeCombustible() {
		
		Propulsor prop = new PropulsorTanqueLleno();
		NaveEspacial nave = new NaveSinCamuflaje(prop);
		Assert.assertEquals(100, nave.getCombustible());
		nave.moverse();
		Assert.assertEquals(90, nave.getCombustible());
	}
	@Test
	public void MuevoNaveHastaGastarCombustibleYNoDeberiaPoderMoverseMas() {
		
		Propulsor prop = new PropulsorTanqueLleno();
		NaveEspacial nave = new NaveSinCamuflaje(prop);
		for (int i = 0; i<10; i++) {
			nave.moverse();
		}
		Assert.assertEquals(100, nave.getPosicionActual()); //hizo 10 pasos de 10 unidades
		Assert.assertEquals(0, nave.getCombustible());
		nave.moverse();
		Assert.assertEquals(100,  nave.getPosicionActual());//No puede moverse sin nafta
	}
}
	

	/*@Test
	public void naveEspacialAtacaOtraNaveEspacialSinCamuflajeProduciria25DeDanio() {
		
		// 1. A
		boolean conCamuflaje = false;
		NaveEspacial nave = new NaveEspacial(conCamuflaje);
		NaveEspacial naveEnemiga = new NaveEspacial(conCamuflaje);

		// 2. A
		nave.atacar(naveEnemiga);
		
		
		// 3. A
		Assert.assertEquals(75, naveEnemiga.vida);
	}
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialConCamuflajeInactivoProduciria25DeDanio() {
		
		// 1. A
		boolean camuflaje = false;
		NaveEspacial nave = new NaveEspacial(camuflaje);
		boolean conCamuflaje = true;
		NaveEspacial naveEnemiga = new NaveEspacial(conCamuflaje);

		// 2. A
		nave.atacar(naveEnemiga);
		
		
		// 3. A
		Assert.assertEquals(75, naveEnemiga.vida);
	}
	
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialConCamuflajeActivoNoProduciriaDanio() {
		
		// 1. A
		boolean camuflaje = false;
		NaveEspacial nave = new NaveEspacial(camuflaje);
		boolean conCamuflaje = true;
		NaveEspacial naveEnemiga = new NaveEspacial(conCamuflaje);
		naveEnemiga.activarCamuflaje();
		
		// 2. A
		nave.atacar(naveEnemiga);
		
		
		// 3. A
		Assert.assertEquals(100, naveEnemiga.vida);
	}
	
	@Test
	public void naveEspacialSeDesplaza10UnidadesPorTurno() {
		
		// 1. A
		boolean camuflaje = false;
		NaveEspacial nave = new NaveEspacial(camuflaje);

		
		// 2. A
		int unidadesDesplazadas = nave.moverse();
		
		
		// 3. A
		Assert.assertEquals(10, unidadesDesplazadas);
	}
	
	@Test
	public void naveEspacialAlDesplazarseUnTurnoGastaria10UnidadesDeCombustible() {
		
		// 1. A
		boolean camuflaje = false;
		NaveEspacial nave = new NaveEspacial(camuflaje);

		
		// 2. A
		nave.moverse();
		
		
		// 3. A
		Assert.assertEquals(90, nave.getPropulsor().getNivelDeCombustible());
	}

}
*/