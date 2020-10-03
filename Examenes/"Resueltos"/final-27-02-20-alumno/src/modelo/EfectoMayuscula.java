package modelo;

import excepciones.NoSePudoAplicarEfectoError;

public class EfectoMayuscula implements Efecto {

	@Override
	public String aplicarA(String unString) {
		if(unString.isEmpty()) throw new NoSePudoAplicarEfectoError();
		return (unString.substring(0,1).toUpperCase()+ unString.substring(1));
	}
	
	
}
