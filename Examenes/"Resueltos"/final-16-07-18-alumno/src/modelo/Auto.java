package modelo;

/*public class Auto {
	
	boolean auto4x4;
	
	public Auto( Boolean TRADICIONAL) {
		this.auto4x4 = TRADICIONAL;
	}

}*/

public class Auto implements Vehiculo {
	
	Superficie superficie;

	@Override
	public void ponerVehiculoEn(Superficie superficie) {
		this.superficie = superficie;
	}
	
	public double getVelocidad() {
		return Vehiculo.VELOCIDADMAXIMA*this.superficie.getFactorVelocidadAuto();
	}
	
	
	
}
