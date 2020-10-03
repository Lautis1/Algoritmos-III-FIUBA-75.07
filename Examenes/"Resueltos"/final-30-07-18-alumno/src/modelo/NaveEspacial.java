package modelo;

public abstract class NaveEspacial {
	
	protected int vidaInicial = 100;
	protected int unidadesAvanzadas = 0;
	protected int coefDesplazamiento = 10;
	protected Propulsor propulsor;
	protected Canion canion;
	

	public NaveEspacial(Propulsor prop){
		this.propulsor = prop;
		this.canion = new Canion(); //este canion se pasa por parametro
	}
	
	public void atacar(NaveEspacial naveEnemiga){
		naveEnemiga.restarVida();
	}

	public abstract void restarVida(); 

	public int moverse(){
		this.unidadesAvanzadas += this.propulsor.avanzar();
		return this.unidadesAvanzadas;
	}
	
	public int getVida() {
		return this.vidaInicial;
	}
}