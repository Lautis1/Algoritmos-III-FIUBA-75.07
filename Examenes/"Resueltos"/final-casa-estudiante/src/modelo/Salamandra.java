package modelo;

import java.util.ArrayList;

public class Salamandra implements ComponenteHogareño {
	
	//private TipoDeMadera madera;
	private ArrayList<TipoDeMadera> maderas = new ArrayList<TipoDeMadera>();
	private int superficieAbarcada;
	private final int cantidadMaximaDeMadera = 15;
	
	
	public Salamandra(int paraSuperficieDe) {
		this.superficieAbarcada = paraSuperficieDe;
	}
	
	public void agregarMadera(TipoDeMadera madera) throws CapacidadDeSalamandraExcedidaError {
		if(madera.cuantoPeso() + pesoDeMisMaderas() > 15) {
			throw new CapacidadDeSalamandraExcedidaError();
		}
		this.maderas.add(madera);
	}
	
	public double pesoDeMisMaderas() {
		double peso = 0;
		for(TipoDeMadera madera: maderas) {
			peso += madera.cuantoPeso();
		}
		return peso;
	}

	@Override
	public double cuantoGasto() {
		// TODO Auto-generated method stub
		double gasto = 0;
		for(TipoDeMadera madera: maderas) {
			gasto += madera.getConsumo()*this.superficieAbarcada;
		}
		return gasto;
	}
	

}
