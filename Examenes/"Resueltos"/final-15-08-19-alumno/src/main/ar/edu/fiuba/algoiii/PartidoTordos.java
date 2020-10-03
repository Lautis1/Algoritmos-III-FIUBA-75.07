package main.ar.edu.fiuba.algoiii;

import java.util.ArrayList;

public class PartidoTordos extends Partido {
	private static final PartidoTordos instancia = new PartidoTordos();
	
	private PartidoTordos() {
		
		this.NOMBRES = new ArrayList<>();
		this.NOMBRES.add("Tordos");
	}
	
	public static PartidoTordos obtenerInstancia() {
		return instancia;
	}
}
