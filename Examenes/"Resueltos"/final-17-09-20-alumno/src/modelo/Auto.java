package modelo;

import java.util.Stack;

public class Auto implements IVehiculo {// TODO Auto-generated method stub
	private EstadoPortabici estado;
	private Stack<Carga> cargas = new Stack<Carga>();
	
	public Auto() {
		this.estado = new SinPortabici();
	}

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
		cargas.push(portabici);
		this.estado = new ConPortabici();
		
	}

	@Override
	public void cargar(Bicicleta bici){
		if(!autoPuedeCargarBici()) {
			throw new AutoNoPoseePortaBiciError();
		}
		cargas.push(bici);
		
	}
	
	public boolean autoPuedeCargarBici() {
		return this.estado.permiteCargarBicicleta();
	}

	@Override
	public Carga descargar() {
		return this.cargas.pop();
	}
	
	

}
