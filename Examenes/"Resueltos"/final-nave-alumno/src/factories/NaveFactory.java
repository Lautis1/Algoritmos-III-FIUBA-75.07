package factories;


import naves.NaveEspacial;
import propulsores.PropulsorInteligente;

public class NaveFactory {

	public NaveEspacial crearNaveBasica() {
		return new NaveEspacial();
	}

	public NaveEspacial crearNaveCamuflada() {
		NaveEspacial nave = new NaveEspacial ();
		nave.agregarCamuflaje();
		return nave;
	}

	public NaveEspacial crearNaveConPropulsorInteligente() {
		NaveEspacial nave = new NaveEspacial ();
		nave.cambiarPropulsor(new PropulsorInteligente());
		return nave;
	}

}
