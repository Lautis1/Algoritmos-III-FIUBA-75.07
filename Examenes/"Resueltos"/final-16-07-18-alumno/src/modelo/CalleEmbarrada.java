package modelo;

public class CalleEmbarrada implements Superficie {
	protected double factorVelocidadAuto = 0;
	protected double factorVelocidadMoto = 0;
	
	@Override
	public double getFactorVelocidadAuto() {
		return this.factorVelocidadAuto;
	}

	@Override
	public double getFactorVelocidadMoto() {
		return this.factorVelocidadMoto;
	}
	

}
