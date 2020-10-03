package modelo;

public class Producto {
	private String nombre;
	private double precio;
	private String categoria;
	
	public Producto(String nombre, float precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public double getPrecio() {
		return precio;
	}
}
