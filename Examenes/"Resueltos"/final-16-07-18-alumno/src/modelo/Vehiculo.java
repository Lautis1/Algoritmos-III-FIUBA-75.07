package modelo;

public interface Vehiculo {
	static final double VELOCIDADMAXIMA = 40.0;
	public void ponerVehiculoEn(Superficie superficie);
	public double getVelocidad();
}
