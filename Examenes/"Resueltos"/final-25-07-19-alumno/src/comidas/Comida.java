package comidas;


import especialistas.Especialista;

public interface Comida {
	
	public abstract int serComida();

	public abstract Comida serCocinadaPor(Especialista especialista);

}
