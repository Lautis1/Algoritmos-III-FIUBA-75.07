package propulsores;

public interface Propulsable {

	boolean tieneCombustible(int cantidadDeCombustible);

	void agregarCombustible(int cantidadDeCombustible);

	int moverNave();

}
