package modelo;

public class Propulsor {
	private TipoDePropulsor tipo;
	private int nivelCombustible = 100;
	
	public Propulsor(TipoDePropulsor tipo) {
		this.tipo = tipo;
	}
	
	public int avanzar() {
		int unidades = this.tipo.avanzar(nivelCombustible);
		nivelCombustible -= unidades;
		return unidades;
	}

	public void cargarCombustible(int cantidad) {
		nivelCombustible += cantidad;
		
	}

	public int getCombustible() {
		return nivelCombustible;
	}
	
}
