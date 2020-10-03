package propulsores;

public abstract class PropulsorAbstracto implements Propulsable {
	
	protected int combustible;
	
	public PropulsorAbstracto () {
		this.combustible = 100;
	}
	@Override
	public boolean tieneCombustible(int cantidadDeCombustible) {
		return (this.combustible == cantidadDeCombustible);
	}

	@Override
	public void agregarCombustible(int cantidadDeCombustible) {
		this.combustible = combustible + cantidadDeCombustible;
	}

}
