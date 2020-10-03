package modelo;

public class Auto extends Transporte {
	
	public Auto(EstadoTelepase estado) {
		this.telepase = estado;
		this.cantidadRuedas = 4;
	}
	
	@Override
	public int calcularCosto() {
		return this.cantidadRuedas/this.telepase.aplicarDescuento(this);
	}
}
