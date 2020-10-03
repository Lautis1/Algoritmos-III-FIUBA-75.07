package modelo;

public class BolaDeEnergia extends Ataque {

	public BolaDeEnergia() {
		this.nombre = "BolaDeEnergia";
		this.danioGenerado = 50;
	}

	@Override
	public void generarAtaque(Atacable enemigo, Atacable atacante) {
		enemigo.serAtacado(this.danioGenerado);
		
	}
	

}
