package modelo;

import excepciones.NoSePudoAplicarEfectoError;

public class EfectoNumero implements Efecto {
	private String cadenaNumero;
	
	public EfectoNumero(String cadena) {
		this.cadenaNumero = cadena;
	}
	@Override
	public String aplicarA(String unString) {
		if(unString.isEmpty()) throw new NoSePudoAplicarEfectoError();
		return unString + this.cadenaNumero;
	}

}
