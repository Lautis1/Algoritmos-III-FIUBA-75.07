package personajes;

import casas.CasaDelChanchito;

public class Hacha extends Herramienta {

	@Override
	public void hacerDanio(CasaDelChanchito casa) {
		casa.esAtacadaCon(this);
		
	}

}
