package modelo;

public class LCD extends TV {
	private double costoFabric;
	
	public LCD(String marca, int pulgadas, String color, double precio, double costoFabricacion) {
		super(marca, pulgadas, color, precio);
		this.costoFabric = costoFabricacion;
	}
	
	public LCD() {
		setDescripcion("LCD");
	}
	
	public double getCostoFabricacion() {
		return costoFabric;
	}
}

