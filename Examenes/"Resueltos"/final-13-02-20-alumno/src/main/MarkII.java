package main;

public class MarkII extends Armadura {

	@Override
	public void hacerDanio(ObjetoVenger venger2) {
		// TODO Auto-generated method stub
		venger2.recibirDanio(12);
	}

	@Override
	protected void absorberVida(IronMan ironMan) {
		// TODO Auto-generated method stub
		ironMan.robarVida(0);
		
	}

	

}
