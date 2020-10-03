package modelo;

public abstract class NaveEspacial {
	
	protected int vidaInicial = 100;
	protected int unidadesAvanzadas = 0;
	protected int coefDesplazamiento = 10;
	protected Propulsor propulsor;
	protected Canion canion;
	

	public NaveEspacial(Propulsor prop, Canion canion){
		this.propulsor = prop;
		this.canion = canion;
	}
	
	public void atacar(NaveEspacial naveEnemiga){
		naveEnemiga.serAtacada();
	}

	public int moverse(){
		this.unidadesAvanzadas += this.propulsor.avanzar();
		return this.unidadesAvanzadas;
	}
	
	public int getVida() {
		return this.vidaInicial;
	}	
	
	public void cargarCombustible(int cantidad) {
		this.propulsor.cargarCombustible(cantidad);
	}
	
	public int getCombustible() {
		return this.propulsor.getCombustible();
	}
	
	public abstract void serAtacada();
}
