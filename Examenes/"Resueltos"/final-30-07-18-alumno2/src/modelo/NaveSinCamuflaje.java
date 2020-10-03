package modelo;

public class NaveSinCamuflaje extends NaveEspacial {

	public NaveSinCamuflaje(Propulsor prop, Canion canion) {
		super(prop, canion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serAtacada() {
		this.vidaInicial -= this.canion.disparar();
		
	}

}
