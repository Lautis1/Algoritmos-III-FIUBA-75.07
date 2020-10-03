package modelo;

public class Ventanilla {
	private EstadoVentanilla estado;
	
	public Ventanilla() {
		estado = new Abierta();
	}
	
	public void suspendete() {
		estado = new Suspendida();
	}
	
	public void abrite() {
		estado = new Abierta();
	}
	
	public void cerrate() {
		estado = new Cerrada();
	}
	
	public void atiende(Persona persona) {
		estado.atiende(persona);
	}
}
