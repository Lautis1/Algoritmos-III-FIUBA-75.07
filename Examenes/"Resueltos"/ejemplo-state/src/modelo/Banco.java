package modelo;

public class Banco {
	private Ventanilla ventanilla;
	
	public Banco() {
		ventanilla = new Ventanilla();
	}
	
	public void atendeA(Persona persona) {
		//hacer algo, no imprimir, solo p ejemplo
		System.out.println(persona.getNombre() + "ingresa a la fila");
		ventanilla.atiende(persona);
	}
	
	public void suspenderVentanilla() {
		ventanilla.suspendete();
	}
	
	public void cerrarVentanilla() {
		ventanilla.cerrate();
	}
	
	public void abrirVentanilla() {
		ventanilla.abrite();
	}

}
