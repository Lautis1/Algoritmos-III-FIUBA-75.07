package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import modelo.BolaDeEnergia;
import modelo.Goku;
import modelo.KameHameHa;
import modelo.SinKaiohken;
import modelo.Vegeta;
import modelo.VegetaNoPuedeUsarEsteAtaqueError;

public class VegetaTest {

	@Test
	public void VegetaAtacaAGokuSinKaiohkenConBolaDeEnergiaDeberiaSacarle50deVida() {
		
		Goku goku = new Goku(new SinKaiohken());
		Vegeta vegeta = new Vegeta();
		vegeta.atacar(goku, new BolaDeEnergia(), vegeta);
		assertEquals(4950, goku.getVida());
	}
	
	@Test 
	public void VegetaNoPuedeAtacarConKameHameHa() {
		Goku goku =  new Goku(new SinKaiohken());
		Vegeta vegeta = new Vegeta();
		assertThrows(VegetaNoPuedeUsarEsteAtaqueError.class,() -> vegeta.atacar(goku, new KameHameHa(), vegeta));
	}
}
