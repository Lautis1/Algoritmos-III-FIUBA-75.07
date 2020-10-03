package modelo;

public class SuperficiePista implements Superficie{

	@Override
	public int deslizar(Corredor corredor) {
		
		return corredor.correr(this);
	}

}
