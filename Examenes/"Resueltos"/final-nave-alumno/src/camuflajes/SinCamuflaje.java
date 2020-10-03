package camuflajes;

public class SinCamuflaje implements Camuflajeable {

	@Override
	public int recibirAtaque(int danio) {
		return danio;
	}

	@Override
	public void activar() {

	}

	@Override
	public void desactivar() {
	
	}

}
