package modelo;

public class Pino extends TipoDeMadera {
	private int coefCalorico = 3;
	
	public Pino() {
		this.precioPorKG = 2;
	}

	@Override
	public double precioPorKGSegunCoeficiente() {
		// TODO Auto-generated method stub
		return this.precioPorKG * this.coefCalorico;
	}
}
