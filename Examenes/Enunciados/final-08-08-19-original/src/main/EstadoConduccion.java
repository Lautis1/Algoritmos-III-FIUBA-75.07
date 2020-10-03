package main;

import java.util.ArrayList;

public abstract class EstadoConduccion {
	private ArrayList<Multa> MultasActivas = new ArrayList<Multa>();
	public abstract boolean aptoParaCircular();
	
	public void agregarMulta(int id) {
		Multa multa = new Multa(id);
		this.MultasActivas.add(multa);
	}
	
	public void borrarMulta(int id) {
		for (int i = 0; i <= this.MultasActivas.size(); i++){
			Multa multaAux = this.MultasActivas.get(i);
			if (multaAux.getId() == id) this.MultasActivas.remove(i);
		}
	}
	
	public boolean hayMultasActivas() {
		return (this.MultasActivas.size() != 0);
	}
}
