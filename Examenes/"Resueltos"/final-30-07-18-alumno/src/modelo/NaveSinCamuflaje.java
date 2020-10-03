package modelo;

public class NaveSinCamuflaje extends NaveEspacial {
	protected int danioRecibido = this.canion.getDanio();
	
	public NaveSinCamuflaje(Propulsor prop) {
		super(prop);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void restarVida() {
		this.vidaInicial -= this.danioRecibido;
		
	}

}
