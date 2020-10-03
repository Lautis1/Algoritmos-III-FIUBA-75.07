package modelo;

import excepciones.NoSePudoAplicarEfectoError;

public class EfectoVoltear implements Efecto {

	@Override
	public String aplicarA(String unString) {
		if(unString.isEmpty()) throw new NoSePudoAplicarEfectoError();
		return new StringBuffer(unString).reverse().toString();
	}

}
