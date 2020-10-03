package modelo;

public class Normal extends TipoDePropulsor {

	@Override
	public int avanzar(int combustible) {
		if(combustible == 0) return 0;
		return 10;
	}

	
}
