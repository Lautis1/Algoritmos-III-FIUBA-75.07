package modelo;

public class PropulsorConvencional extends Propulsor {
	
	protected int coefDesplazamiento = 10;
	protected int gastoCombustible = 10;
	
	@Override
	public int avanzar() {
		if (this.nivelCombustible == 0) return 0;
		this.nivelCombustible -= this.gastoCombustible;
		return this.coefDesplazamiento;
	}

}
