package modelo;

public class Caballo implements Vehiculo {
	
	Superficie superficie;
	@Override
	public void ponerVehiculoEn(Superficie superficie) {
		this.superficie = superficie;
		
	}

	@Override
	public double getVelocidad() {
		return 20;
	}

}
