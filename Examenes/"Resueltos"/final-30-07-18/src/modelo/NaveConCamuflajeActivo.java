package modelo;

public class NaveConCamuflajeActivo extends NaveEspacial {
	
	public NaveConCamuflajeActivo(Propulsor propulso) {
		super(propulso);
	}

	public void restarVida(int danioRecibido) { //como tiene camflaje activo, no resta vida.
		this.vidaInicial -= 0;
	}
}