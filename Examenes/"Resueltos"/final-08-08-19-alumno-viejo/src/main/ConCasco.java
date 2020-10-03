package main;

public class ConCasco extends EstadoConduccion {

	@Override
	public boolean aptoParaCircular() {
		
		return (true && (!this.hayMultasActivas()));
	}

}
