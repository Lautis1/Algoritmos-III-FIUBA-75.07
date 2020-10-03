package modelo;

public class PropulsorInteligente extends Propulsor {
	
	protected ModoDePropulsor modo;
	

	@Override
	public int avanzar() {
		if (this.nivelCombustible == 0) return 0;
		if (this.nivelCombustible <= 50) {
			this.modo = new ModoAhorro();
			
		}
		else this.modo = new ModoNormal();
		this.nivelCombustible -= this.modo.gastoPermitido();
		return this.modo.avancePermitido();
	}
	
	

}
