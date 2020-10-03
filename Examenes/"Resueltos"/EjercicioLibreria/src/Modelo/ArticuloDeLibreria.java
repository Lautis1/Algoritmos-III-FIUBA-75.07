package Modelo;

public class ArticuloDeLibreria extends Producto {
	
	public ArticuloDeLibreria(String nombre) {
		this.nombre = nombre;
		this.iva = new ConIVA();
	}
}
