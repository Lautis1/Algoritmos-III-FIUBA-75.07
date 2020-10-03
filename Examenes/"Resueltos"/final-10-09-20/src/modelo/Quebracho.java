package modelo;

public class Quebracho extends TipoDeMadera {
	private int gradoPureza = 2;
	
	public Quebracho() {
		this.precioPorKG = 4;
	}

	@Override
	public double precioPorKGSegunCoeficiente() {
		// TODO Auto-generated method stub
		return this.gradoPureza * this.precioPorKG;
	}
	
}
