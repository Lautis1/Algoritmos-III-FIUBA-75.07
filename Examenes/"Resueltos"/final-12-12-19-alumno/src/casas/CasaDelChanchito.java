package casas;

import personajes.Hacha;
import personajes.Herramienta;
import personajes.Pulmones;
import personajes.TaladroRotopercutor;

public abstract class CasaDelChanchito {

	public boolean destruida;
	
	public void esAtacadaCon(Herramienta herramienta) {}
	public abstract void esAtacadaCon(Pulmones pulmones);
	public abstract void esAtacadaCon(Hacha hacha);
	//Agrego taladro rotopercutor
	public abstract void esAtacadaCon(TaladroRotopercutor taladro);
	
	public boolean estaDestruida() {
		return this.destruida;
	}
}
