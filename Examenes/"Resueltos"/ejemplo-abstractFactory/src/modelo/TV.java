package modelo;

public abstract class TV {
	//Todos estos llevan sus metodos get y set, pero no hace falta
	//para el ejemplo
	private String marca;
	private int pulgadas;
	private String color;
	private String descripcion;
	private double precio; 
	
	public TV() {}
	
	public TV(String marca, int pulgadas, String color, double precio) {
		setMarca(marca);
		setPulgadas(pulgadas);
		setPrecio(precio);
		setColor(color);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setDescripcion(String desc) {
		this.descripcion = desc;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
}
