package modelo;

import java.util.ArrayList;

import Excepciones.CapacidadDeSalamandraExcedidaError;

public class Salamandra extends ComponenteNoElectrico {
	
	//private TipoDeMadera madera;
	private ArrayList<TipoDeMadera> maderas = new ArrayList<TipoDeMadera>();
	private int superficieAbarcada;
	private int cantidadMaximaDeMadera = 15;
	
	
	public Salamandra(int paraSuperficieDe) {
		this.superficieAbarcada = paraSuperficieDe;
	}
	
	public void agregarMadera(TipoDeMadera madera) {
		this.maderas.add(madera);
	}
	
	//SUPUESTO: la cantidad de madera necesaria es la mitad del valor numero de la superficie
	//No puede superar a 15kg, por ende no se puede calentar una superfice de mas de 30 m2
	
	public double KgDeMaderaNecesarios() throws CapacidadDeSalamandraExcedidaError{
		if(this.superficieAbarcada/2 > this.cantidadMaximaDeMadera) {
			throw new CapacidadDeSalamandraExcedidaError();			
		}
		return this.superficieAbarcada/2;
	}
	
	@Override
	public double cuantoGasto() throws Exception {
		// TODO Auto-generated method stub
		
		int precioPorMadera = 0;
		for(TipoDeMadera madera: maderas) {
			precioPorMadera += madera.precioPorKGSegunCoeficiente();
		}
		return this.KgDeMaderaNecesarios() * this.superficieAbarcada * precioPorMadera;
	}

}
