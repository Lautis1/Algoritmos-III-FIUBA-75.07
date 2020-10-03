package main;

public class Conductor {

	private EstadoDeCirculacion estado;
	private Vehiculo loQueEstoyManejando;
	
	public Conductor(Vehiculo vehiculo, EstadoDeCirculacion estadoActual) {
		this.loQueEstoyManejando = vehiculo;
		this.estado = estadoActual;
	}
	
	
	public void agregarInfraccion(int monto) {
		this.loQueEstoyManejando.agregarMulta(monto);
	}
	
	public void pagarInfraccion(int monto) {
		this.loQueEstoyManejando.quitarMulta(monto);
	}
	
	public boolean puedoCircular() {
		return (this.loQueEstoyManejando.tieneMultasActivas() && this.estado.aptoParaCircular());
	}
	
}
