package modelo;

import excepciones.NoSePudoAplicarEfectoError;

public class EfectoMinuscula implements Efecto {

	@Override
	public String aplicarA(String unString) throws NoSePudoAplicarEfectoError {
		// TODO Auto-generated method stub
		if(unString.isEmpty()) throw new NoSePudoAplicarEfectoError();
		return (unString.substring(0,1).toLowerCase()+ unString.substring(1));
	}

}
