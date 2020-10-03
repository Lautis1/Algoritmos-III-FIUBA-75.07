package modelo;

public class Cerrada implements EstadoVentanilla {

	@Override
	public void atiende(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Ventanilla cerrada");
	}

}
