package modelo;

public class EfectoNumero implements Efecto {
	private String cadenaNumero;
	
	public EfectoNumero(String cadena) {
		this.cadenaNumero = cadena;
	}
	
	@Override
	public String aplicarA(String unString) {
		// Agregar un numero al final del string
		return unString + this.cadenaNumero;
		
	}

}
