package modelo;

public class SinPortabici implements EstadoPortabici {

	@Override
	public boolean permiteCargarBicicleta() {
		return false;
	}

}
