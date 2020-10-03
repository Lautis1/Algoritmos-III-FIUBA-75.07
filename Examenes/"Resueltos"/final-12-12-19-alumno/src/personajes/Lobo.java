package personajes;

import casas.CasaDelChanchito;

public class Lobo {

	protected Herramienta herramienta;
	
	public Lobo() {
		this.herramienta = new Pulmones();
	}
	
	public void cambiarHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}
	
	public void atacar(CasaDelChanchito casa) {
		this.herramienta.hacerDanio(casa);
	}
	
}
