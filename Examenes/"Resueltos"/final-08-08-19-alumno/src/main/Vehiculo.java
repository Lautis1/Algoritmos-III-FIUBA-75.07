package main;
import java.util.ArrayList;

public abstract class Vehiculo {
	
	private ArrayList<Multa> multasActivas = new ArrayList<Multa>();
	
	public void agregarMulta(int monto) {
		Multa multa = new Multa(monto);
		this.multasActivas.add(multa);
	}
	
	public void quitarMulta(int monto) {
		for(int i = 0; i <= this.multasActivas.size(); i++) {
			Multa multaAux = this.multasActivas.get(i);
			if (multaAux.getMonto() == monto) this.multasActivas.remove(i);
		}
	}
	
	public boolean tieneMultasActivas() {
		return this.multasActivas.isEmpty();
	}
	
	
	
}
