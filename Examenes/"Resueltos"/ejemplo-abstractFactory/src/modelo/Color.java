package modelo;

public abstract class Color {
	private String descripcion;
	
	public abstract void colorear(TV tv);
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
