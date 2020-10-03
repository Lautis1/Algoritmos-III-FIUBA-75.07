package modelo;

public class NaveConCamuflaje extends NaveEspacial {
	protected int danioRecibido = 0; // no se puede atacar
	
	
	public NaveConCamuflaje(Propulsor prop) {
		super(prop);
		// TODO Auto-generated constructor stub
	}	

	@Override
	public void restarVida() {
		this.vidaInicial -= this.danioRecibido;
		
	}
	

}
