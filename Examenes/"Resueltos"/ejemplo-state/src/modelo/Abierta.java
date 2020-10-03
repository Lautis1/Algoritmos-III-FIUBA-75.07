package modelo;

public class Abierta implements EstadoVentanilla {

	@Override
	public void atiende(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Atendiendo a: "+ persona.getNombre());
	}

}
