package modelo;

public class EfectoVoltearString implements Efecto {

	@Override
	public String aplicarA(String unString) {
		// devuelve el string volteado
		return new StringBuffer(unString).reverse().toString();
	}

}
