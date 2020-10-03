package test;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import modelo.BolaDeEnergia;
import modelo.GalickHo;
import modelo.Goku;
import modelo.GokuNoPuedeUsarEsteAtaqueError;
import modelo.KaiohKen;
import modelo.KaiohKenx3;
import modelo.KameHameHa;
import modelo.SinKaiohken;
import modelo.Vegeta;

public class GokuTest {

	@Test
	public void GokuSinKaiohKenAtacaAVegetaConKameHameHaDeberiaSacarle100deVida() {
		
		Goku goku = new Goku(new SinKaiohken());
		Vegeta vegeta = new Vegeta();
		goku.atacar(vegeta, new KameHameHa(), goku);
		assertEquals(5900, vegeta.getVida());
	}
	@Test
	public void GokuConKaiohkenAtacaAVegetaConBolaDeEnergiaDeberiaSacarle50DeVida(){
		
		Goku goku = new Goku(new KaiohKen());
		Vegeta vegeta = new Vegeta();
		goku.atacar(vegeta, new BolaDeEnergia(), goku);
		assertEquals(5950, vegeta.getVida());
	}
	@Test
	public void GokuConKaiohKenx3AtacaAVegetaConKameHameHaDeberiaSacarle100yel15porcdeSuVida(){
		
		Goku goku = new Goku(new KaiohKenx3());
		Vegeta vegeta = new Vegeta();
		goku.atacar(vegeta, new KameHameHa(),goku);
		assertEquals(6000-100-(6000*0.15), vegeta.getVida());
	}
	
	@Test
	public void GokuNoPuedeAtacarConGalickHo() {
		Goku goku = new Goku(new KaiohKen()); //vale para cualquier kaiohken
		Vegeta vegeta = new Vegeta();
		assertThrows(GokuNoPuedeUsarEsteAtaqueError.class,() -> goku.atacar(vegeta, new GalickHo(), goku));
	}
		
}
