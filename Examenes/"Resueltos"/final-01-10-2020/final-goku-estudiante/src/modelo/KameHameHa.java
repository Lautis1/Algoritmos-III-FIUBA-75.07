package modelo;

public class KameHameHa extends Ataque {

	public KameHameHa() {
		this.nombre = "KameHameHa";
		this.danioGenerado = 100;
	}

	@Override
	public void generarAtaque(Atacable enemigo, Atacable atacante) {
		
		enemigo.serAtacado(this.danioGenerado + atacante.danioPorKaiohken(enemigo.getVida()));
		
	}
	

}
