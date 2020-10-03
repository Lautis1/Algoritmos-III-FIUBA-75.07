package modelo;

import excepciones.NoSePudoAplicarEfectoError;

public class VoltearYMayuscula extends EfectoDecorador {
	
	public VoltearYMayuscula(EfectoMayuscula mayuscula, EfectoVoltear voltear) {
		super(mayuscula, voltear);
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
