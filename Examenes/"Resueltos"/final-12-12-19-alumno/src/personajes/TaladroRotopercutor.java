package personajes;

import casas.CasaDelChanchito;

public class TaladroRotopercutor extends Herramienta{

	@Override
	public void hacerDanio(CasaDelChanchito casa) {
		// TODO Auto-generated method stub
		casa.esAtacadaCon(this);
	}

}
