package main;

import java.util.ArrayList;

public class IronMan extends ObjetoVenger {
	
	private ArrayList<Armadura> armaduras = new ArrayList<>();
	
	public IronMan() {
		this.puntosDeVida = 100;
		this.armaduras.add(new MarkI());
	}
	
	public void agregarArmadura(Armadura armadura) {
		this.armaduras.add(armadura);
	}
		
	
	@Override
	public void atacar(ObjetoVenger otroAvenger) {
		// TODO Auto-generated method stub
		for(Armadura armadura: armaduras) {
			armadura.hacerDanio(otroAvenger);
			armadura.absorberVida(this);
		}
	}
		
	public void robarVida(int vida) {
		this.puntosDeVida += vida;
	}
		
	

	@Override
	public void recibirDanio(int danio) {
		// TODO Auto-generated method stub
		this.puntosDeVida -= danio;
		
	}
	
	
	

}
