package naves;

import camuflajes.Camuflajeable;
import camuflajes.ConCamuflaje;
import camuflajes.SinCamuflaje;
import propulsores.Propulsable;
import propulsores.PropulsorComun;

public class NaveEspacial implements Atacable,Movible {
	
	private Camuflajeable camuflaje;
	private int vida;
	private Propulsable propulsor;
	private int danioDeCanion;

	public NaveEspacial(){
		camuflaje = new SinCamuflaje();
		propulsor = new PropulsorComun();
		vida = 100;
		danioDeCanion = 25;
	}
	
	public void activarCamuflaje(){
		camuflaje.activar();
	}
	
	public void desactivarCamuflaje(){
		camuflaje.desactivar();
	}
	
	public void atacar(Atacable otroAtacable){
		otroAtacable.recibirAtaque(this.danioDeCanion);
	}
	
	public int moverse(){
		return propulsor.moverNave();
	}

	public void agregarCamuflaje() {
		camuflaje = new ConCamuflaje();
	}

	public void cambiarPropulsor(Propulsable propulsor) {
		this.propulsor = propulsor;
	}

	@Override
	public boolean tieneCombustible(int cantidadDeCombustible) {
		return propulsor.tieneCombustible(cantidadDeCombustible);
	}

	@Override
	public void cargarCombustible(int cantidadDeCombustible) {
		propulsor.agregarCombustible(cantidadDeCombustible);
	}

	@Override
	public boolean tieneVida(int vida) {
		return (this.vida == vida);
	}

	@Override
	public void recibirAtaque(int danio) {
		int danioRecibido = camuflaje.recibirAtaque(danio);
		this.vida = (vida - danioRecibido);
	}

}
