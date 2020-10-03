package modelo;

public class Pino extends TipoDeMadera {
	private static final int coefCalorico = 3;
	private static final int precioPorKG = 2;
	
	public Pino(double peso) {
		super(peso, precioPorKG);
	}

	@Override
	public double getConsumo() {
		return coefCalorico*precioPorKG;
	}

	
}
