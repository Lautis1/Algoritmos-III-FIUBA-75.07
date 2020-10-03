package modelo;

public abstract class EfectoDecorator implements Efecto {
	private Efecto efectoAlQueDecora;
	
	public EfectoDecorator(Efecto efecto) {
		this.efectoAlQueDecora = efecto;
	}
	
	public Efecto getEfectoADecorar() {
		return this.efectoAlQueDecora;
	}
	
}
