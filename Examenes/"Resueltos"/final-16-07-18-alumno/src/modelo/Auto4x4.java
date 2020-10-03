package modelo;

public class Auto4x4 extends Auto {
	
	protected double diminucionVelocidad = 0.25;
	
	public double getDisminucionVelocidad() {
		return this.diminucionVelocidad;
	}
	
	public double getVelocidad() {
		return Vehiculo.VELOCIDADMAXIMA*this.getDisminucionVelocidad();
	}
}
