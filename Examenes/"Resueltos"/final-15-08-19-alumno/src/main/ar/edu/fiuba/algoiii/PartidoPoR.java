package main.ar.edu.fiuba.algoiii;

import java.util.ArrayList;

public class PartidoPoR extends Partido {
	
	private static final PartidoPoR instancia = new PartidoPoR();
	
	private PartidoPoR() {
		
		this.NOMBRES = new ArrayList<>();
		this.NOMBRES.add("POR");
		this.NOMBRES.add("PoR");
		this.NOMBRES.add("pOr");
		this.NOMBRES.add("PxR");
	}
	
	public static PartidoPoR obtenerInstancia() {
		return instancia;
	}
	

}
