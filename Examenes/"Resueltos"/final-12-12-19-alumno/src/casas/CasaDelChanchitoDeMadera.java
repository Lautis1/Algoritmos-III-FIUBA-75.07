package casas;

import personajes.Hacha;
import personajes.Pulmones;
import personajes.TaladroRotopercutor;

public class CasaDelChanchitoDeMadera extends CasaDelChanchito{

	@Override
	public void esAtacadaCon(Pulmones pulmones) {
		// TODO Auto-generated method stub
		this.destruida = false;
	}

	@Override
	public void esAtacadaCon(Hacha hacha) {
		// TODO Auto-generated method stub
		this.destruida = true;
	}

	@Override
	public void esAtacadaCon(TaladroRotopercutor taladro) {
		// TODO Auto-generated method stub
		this.destruida = true;
	}
	
}
