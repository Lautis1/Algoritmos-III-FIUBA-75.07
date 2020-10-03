package modelo;

public class Estufa extends ComponenteElectrico {
	private int caloriasEntregadas;
	private int cantidadDeAmbientesACalentar = 1;
	
	public Estufa(int deCuantasCalorias) {
		this.caloriasEntregadas = deCuantasCalorias;
	}

	@Override
	public double cuantoGasto() {
		// TODO Auto-generated method stub
		return this.precioKw * this.cantidadDeAmbientesACalentar * this.caloriasEntregadas;
	}
	
}
