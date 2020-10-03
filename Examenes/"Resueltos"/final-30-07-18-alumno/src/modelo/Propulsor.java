package modelo;

public abstract class Propulsor {

	protected int nivelCombustible = 100;
	
	public int getNivelDeCombustible() {
		return nivelCombustible;
	}

	public abstract int avanzar();
}
