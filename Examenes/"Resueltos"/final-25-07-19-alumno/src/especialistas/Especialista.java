package especialistas;

import comidas.Comida;
import comidas.Empanada;
import comidas.EmpanadaCeliaca;
import comidas.EmpanadaHipertensa;
import comidas.Pan;
import comidas.PanCeliaco;
import comidas.PanHipertenso;

public interface Especialista {
	public abstract Comida cocinar(Comida comida);
	public abstract Comida cocinar(Empanada empanada);
	public abstract Comida cocinar(EmpanadaCeliaca empanadaCel);
	public abstract Comida cocinar(EmpanadaHipertensa empanadaHip);
	public abstract Comida cocinar(Pan pan);
	public abstract Comida cocinar(PanCeliaco panCel);
	public abstract Comida cocinar(PanHipertenso panHip);
	

}