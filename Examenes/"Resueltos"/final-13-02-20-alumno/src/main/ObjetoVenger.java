package main;

public abstract class ObjetoVenger {
	
	protected int puntosDeVida;
	
	public abstract void atacar(ObjetoVenger otroAvenger);
	public abstract void recibirDanio(int danio);
	public int getPuntosDeVida() {
		return puntosDeVida;
	}

    
}
