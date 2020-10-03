package modelo;

public abstract class Transporte {
	
	protected int cantidadRuedas;
	EstadoTelepase telepase;
	public abstract int calcularCosto();
}
	/*private boolean telepase;
	
	public Transporte(int ruedas) {
		this.ruedas = ruedas;
		this.telepase = false;
	}

	public int getRuedas(){
		return ruedas;
	}
	
	public void instalarTelepase(){
		if (this.ruedas == 2){
			//A las motos no se les puede poner telepase
			this.telepase = false;
		}else{
			this.telepase = true;
		}
	}
	
	public boolean tieneTelepase(){
		return telepase;
	}
}*/
