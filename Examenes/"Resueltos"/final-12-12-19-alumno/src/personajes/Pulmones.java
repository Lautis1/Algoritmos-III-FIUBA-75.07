package personajes;

import casas.CasaDelChanchito;

public class Pulmones extends Herramienta {

	@Override
	public void hacerDanio(CasaDelChanchito casa) {
		casa.esAtacadaCon(this);
		
	}

}
