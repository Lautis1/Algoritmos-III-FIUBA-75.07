package modelo;

public class Quebracho extends TipoDeMadera {
	private static final int gradoPureza = 2;
	private static final int precioPorKG = 4;
	
	public Quebracho(double peso) {
		super(peso, precioPorKG);
	}

	@Override
	public double getConsumo() {
		return gradoPureza*precioPorKG;
	}
	
}
