package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Atacable { 
	
	protected double vida;
	protected HashMap<String,Ataque> ataquesPermitidos = new HashMap<String,Ataque>();
	
	public abstract void atacar(Atacable atacable, Ataque ataque, Atacable atacante);
	public abstract void atacar(Vegeta vegeta, Ataque ataque, Atacable atacante);
	public abstract void atacar(Goku goku, Ataque ataque, Atacable atacante);
	
	public void serAtacado(double danio) {
		this.vida -= danio;
	}
	
	public double getVida() {
		return this.vida;
	}
	protected abstract double danioPorKaiohken(double danioEnemigo);
}
