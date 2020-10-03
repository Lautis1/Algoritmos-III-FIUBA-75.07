package camuflajes;

public class ConCamuflaje implements Camuflajeable {
	
	private Estado estado;
	
	public ConCamuflaje () {
		this.estado = new Activo();
	}
	
	@Override
	public int recibirAtaque(int danio) {
		return this.estado.recibirAtaque(danio);
	}

	@Override
	public void activar() {
		this.estado = new Activo();
	}

	@Override
	public void desactivar() {
		this.estado = new Inactivo();
	}

}
