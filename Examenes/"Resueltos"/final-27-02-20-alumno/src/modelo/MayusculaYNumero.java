package modelo;

import excepciones.NoSePudoAplicarEfectoError;

public class MayusculaYNumero extends EfectoDecorador {
	
	public MayusculaYNumero(EfectoMayuscula mayuscula, EfectoNumero numero) {
		super(mayuscula, numero);
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
