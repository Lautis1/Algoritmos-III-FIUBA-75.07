package camuflajes;

public class Inactivo extends Estado {

	@Override
	public int recibirAtaque(int danio) {
		return danio;
	}

}
