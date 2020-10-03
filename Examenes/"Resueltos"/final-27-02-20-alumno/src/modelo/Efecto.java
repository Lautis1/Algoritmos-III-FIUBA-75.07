package modelo;

import excepciones.NoSePudoAplicarEfectoError;

public interface Efecto {
	
	public abstract String aplicarA(String unString) throws NoSePudoAplicarEfectoError;
}
