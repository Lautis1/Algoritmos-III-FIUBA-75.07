package modelo;

/*public class Propulsor {

	private int nivelDeCombustible;
	private int coeficienteDeDesplazamiento;
	
	public Propulsor(){
		setNivelDeCombustible(100); //Al maximo
		coeficienteDeDesplazamiento = 10;
	}

	public int getNivelDeCombustible() {
		return nivelDeCombustible;
	}

	public void setNivelDeCombustible(int nivelDeCombustible) {
		this.nivelDeCombustible = nivelDeCombustible;
	}

	public int getCoeficienteDeDesplazamiento() {
		return coeficienteDeDesplazamiento;
	}
}*/

public abstract class Propulsor {
	protected int nivelCombustible = 100;
	protected int coefDesplazamiento = 10;
	protected int gastoCombustible = 10;
	
	public int getNivelDeCombustible() {
		return this.nivelCombustible;
	}
	public abstract int avanzar();
}
