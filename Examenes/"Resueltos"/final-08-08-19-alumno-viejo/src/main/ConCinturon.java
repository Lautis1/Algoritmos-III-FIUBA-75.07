package main;

public class ConCinturon extends EstadoConduccion {

	@Override
	public boolean aptoParaCircular() {
		
		return (true && (!this.hayMultasActivas()));
	}

}
