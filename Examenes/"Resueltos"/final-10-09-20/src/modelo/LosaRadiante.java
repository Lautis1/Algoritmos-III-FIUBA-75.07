package modelo;

public class LosaRadiante extends ComponenteElectrico {
	private double superficieAbarcada;
	
	public LosaRadiante(double paraSuperficie) {
		this.superficieAbarcada = paraSuperficie;
	}

	@Override
	public double cuantoGasto() {
		// TODO Auto-generated method stub
		return this.precioKw * this.superficieAbarcada;
	}
}
