package modelo;

public class SuperficieHielo implements Superficie {

	@Override
	public int deslizar(Corredor corredor) {
		return corredor.correr(this);
	}
	

}
