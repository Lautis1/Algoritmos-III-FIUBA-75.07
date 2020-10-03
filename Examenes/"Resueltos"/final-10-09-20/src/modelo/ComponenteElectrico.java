package modelo;

public abstract class ComponenteElectrico implements ComponenteHogareño {
	protected int precioKw = 10;
	
	public abstract double cuantoGasto();
}
