package modelo;

public class AsfaltoPerrosFuriosos implements Superficie {
	protected double factorVelocidadAuto = 1;
	protected double factorVelocidadMoto = 0.5;

	@Override
	public double getFactorVelocidadAuto() {
		
		return this.factorVelocidadAuto;
	}

	@Override
	public double getFactorVelocidadMoto() {
	
		return this.factorVelocidadMoto;
	}

}
