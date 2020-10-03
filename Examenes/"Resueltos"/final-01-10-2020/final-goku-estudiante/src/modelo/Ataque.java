package modelo;

public abstract class Ataque {
	
	protected double danioGenerado;
	protected String nombre;

	public String getNombre() {
		return this.nombre;
	}
	
	public abstract void generarAtaque(Atacable enemigo, Atacable atacante);
	
}
