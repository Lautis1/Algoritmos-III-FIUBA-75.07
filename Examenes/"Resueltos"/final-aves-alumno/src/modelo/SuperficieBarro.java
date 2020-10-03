package modelo;

public class SuperficieBarro implements Superficie {

	@Override
	public int deslizar(Corredor corredor) {
		
		return corredor.correr(this);
	}

}
