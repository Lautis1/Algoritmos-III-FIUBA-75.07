package modelo;

import java.util.Stack;

public class Moto implements IVehiculo {
	private Stack<Carga> cargas = new Stack<Carga>();
	
	@Override
	public void cargar(Carga carga) {
		carga.serCargadaEn(this);		
	}

	@Override
	public void cargar(Helatodo heladerita) {
		cargas.push(heladerita);		
	}

	@Override
	public void cargar(Portabici portabici) {
		throw new MotoNoPuedeCargarPortaBiciError();		
	}

	@Override
	public void cargar(Bicicleta bici){
		throw new MotoNoPuedeCargarBicicletaError();		
	}

	@Override
	public Carga descargar() {
		return this.cargas.pop();
	}

}
