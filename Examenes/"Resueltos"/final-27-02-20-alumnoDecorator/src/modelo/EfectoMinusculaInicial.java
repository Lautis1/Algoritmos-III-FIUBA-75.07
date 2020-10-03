package modelo;

public class EfectoMinusculaInicial implements Efecto{

	@Override
	public String aplicarA(String unString) {
		// convierte la primer letra en minuscula
		return (unString.substring(0,1).toLowerCase()+ unString.substring(1));
	}

}
