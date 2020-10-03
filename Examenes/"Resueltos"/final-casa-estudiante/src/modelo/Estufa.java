package modelo;

public class Estufa implements ComponenteHogareño{
	private int caloriasEntregadas;
	private int cantidadDeAmbientesACalentar;
	private final int PRECIOKW = 10;
	
	public Estufa(int deCuantasCalorias, int ambientes) {
		this.caloriasEntregadas = deCuantasCalorias;
		this.cantidadDeAmbientesACalentar = ambientes;
	}

	@Override
	public double cuantoGasto() {
	
		return this.PRECIOKW * this.cantidadDeAmbientesACalentar * this.caloriasEntregadas;
	}
	
}
