package modelo;

public class LosaRadiante implements ComponenteHogareño {
	private double superficieAbarcada;
	private final int PRECIOKW = 10;
	
	public LosaRadiante(double paraSuperficie) {
		this.superficieAbarcada = paraSuperficie;
	}

	@Override
	public double cuantoGasto() {
		// TODO Auto-generated method stub
		return this.PRECIOKW * this.superficieAbarcada;
	}
}
