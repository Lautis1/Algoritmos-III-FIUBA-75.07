package modelo;

public class Moto extends Transporte {
	
	public Moto() {
		this.cantidadRuedas = 2;
	}
	
	@Override
	public int calcularCosto() {
		
		return this.cantidadRuedas;
	}

}
