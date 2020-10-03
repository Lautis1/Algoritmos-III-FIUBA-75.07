package modelo;

import excepciones.NoSePudoAplicarEfectoError;

public class NumeroYMinuscula extends EfectoDecorador {
	
	public NumeroYMinuscula(EfectoNumero numero, EfectoMayuscula mayuscula) {
		super(numero, mayuscula);
	}

	@Override
	public String aplicarA(String unString) throws NoSePudoAplicarEfectoError {
		// TODO Auto-generated method stub
		return this.getEfecto().aplicarA(unString) + decoradorHaceAlgo(unString);
	}

	@Override
	public String decoradorHaceAlgo(String string) {
		// TODO Auto-generated method stub
		return this.getEfectoExtra().aplicarA(string);
	}

}
