package modelo;

public class Inteligente extends TipoDePropulsor {
	private Modo modo;
	
	@Override
	public int avanzar(int combustible) {
		if(combustible == 0) return 0;
		if(combustible <= 50) this.modo = new ModoAhorro();
		else this.modo = new ModoNormal();
		
		return this.modo.getUnidades();
	}

}
