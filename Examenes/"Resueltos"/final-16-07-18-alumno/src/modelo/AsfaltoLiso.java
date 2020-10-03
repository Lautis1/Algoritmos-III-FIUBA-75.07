package modelo;

public class AsfaltoLiso implements Superficie {
	protected double factorVelocidadAuto = 1;
	protected double factorVelocidadMoto = 1;
	
	@Override
	public double getFactorVelocidadAuto() {
		
		return this.factorVelocidadAuto;
	}
	@Override
	public double getFactorVelocidadMoto() {
		
		return this.factorVelocidadMoto;
	}
	
}
