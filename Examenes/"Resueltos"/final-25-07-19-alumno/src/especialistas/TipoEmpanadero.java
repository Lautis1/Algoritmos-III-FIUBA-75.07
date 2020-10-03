package especialistas;

import comidas.Comida;
import comidas.EmpanadaCeliaca;
import comidas.EmpanadaHipertensa;

public interface TipoEmpanadero {
	public abstract Comida cocinar(EmpanadaCeliaca emp);
	public abstract Comida cocinar(EmpanadaHipertensa emp);
}
