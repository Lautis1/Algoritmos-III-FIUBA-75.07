package modelo;

public class AsfaltoLomaDeBurro implements Superficie {
	protected double factorVelocidadAuto = 0.5;
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
