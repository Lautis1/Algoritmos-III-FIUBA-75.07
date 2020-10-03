package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Casa {
	
	protected ArrayList<ComponenteHogareño> componentes = new ArrayList<ComponenteHogareño>();
	
	public int getGastoTotal() throws Exception {
		int gasto = 0;
		for(ComponenteHogareño componente: componentes) {
			gasto += componente.cuantoGasto();
		}
		return gasto;
	}
	
	public void agregarComponenteACasa(ComponenteHogareño componente) {
		this.componentes.add(componente);
	}
}
