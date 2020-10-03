package modelo;

public abstract class TipoDeMadera {
	protected double precioPorKG;
	protected double peso;
	
	public TipoDeMadera(double peso, double precioKG) {
		this.precioPorKG = precioKG;
		this.peso = peso;
	}
	
	public double cuantoPeso() {
		return this.peso;
	}
	
	public abstract double getConsumo();
	
	
}
