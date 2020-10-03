package main.ar.edu.fiuba.algoiii;

import java.util.ArrayList;

public abstract class Partido {
	
	private int votos;
	protected ArrayList<String> NOMBRES;
	
	public void recibirVotos(int cantidadDeVotos) {
		this.votos += cantidadDeVotos;
	}
	
	public int escrutar() {
		return this.votos;
	}
	
	public void resetear() {
		this.votos = 0;
	}

	public boolean seLlama(String nombre) {
		return NOMBRES.contains(nombre);
	}
}
