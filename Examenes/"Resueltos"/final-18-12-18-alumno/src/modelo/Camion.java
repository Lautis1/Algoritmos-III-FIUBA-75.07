package modelo;

public class Camion extends Transporte {
	
	public Camion(EstadoTelepase estado) {
		this.cantidadRuedas = 18;
		this.telepase = estado;
	}

	@Override
	public int calcularCosto() {
	
		return this.cantidadRuedas/this.telepase.aplicarDescuento(this);
	}

}
