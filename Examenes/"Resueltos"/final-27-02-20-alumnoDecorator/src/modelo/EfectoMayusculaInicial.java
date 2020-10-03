package modelo;

public class EfectoMayusculaInicial implements Efecto {

	@Override
	public String aplicarA(String unString) {
		// Convierte la primer letra a mayuscula
		return (unString.substring(0,1).toUpperCase()+ unString.substring(1));
	}

}
