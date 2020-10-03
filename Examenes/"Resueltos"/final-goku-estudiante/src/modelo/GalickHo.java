package modelo;

public class GalickHo extends Ataque{

	public GalickHo() {
		this.nombre = "GalickHo";
		this.danioGenerado = 100;
	}

	@Override
	public void generarAtaque(Atacable enemigo, Atacable atacante) {
		enemigo.serAtacado(this.danioGenerado + enemigo.getVida()*0.1);
		
	}
	

}
