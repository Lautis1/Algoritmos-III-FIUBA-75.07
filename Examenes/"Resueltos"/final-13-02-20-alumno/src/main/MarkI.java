package main;

public class MarkI extends Armadura {

	@Override
	public void hacerDanio(ObjetoVenger venger2) {
		// TODO Auto-generated method stub
		venger2.recibirDanio(10);
	}

	@Override
	protected void absorberVida(IronMan ironMan) {
		// TODO Auto-generated method stub
		ironMan.robarVida(0);
		
	}

	
}
