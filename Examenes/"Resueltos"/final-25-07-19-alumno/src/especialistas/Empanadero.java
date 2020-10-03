package especialistas;

import comidas.Comida;
import comidas.Empanada;
import comidas.EmpanadaCeliaca;
import comidas.EmpanadaHipertensa;
import comidas.Pan;
import comidas.PanCeliaco;
import comidas.PanHipertenso;

public class Empanadero implements Especialista {
	private TipoEmpanadero tipo;
	
	public Empanadero(TipoEmpanadero tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public Comida cocinar(Comida comida) {
		// TODO Auto-generated method stub
		return comida.serCocinadaPor(this);
	}

	@Override
	public Comida cocinar(Empanada empanada) {
		// TODO Auto-generated method stub
		return empanada;
	}

	@Override
	public Comida cocinar(EmpanadaCeliaca empanadaCel) {
		// TODO Auto-generated method stub
		return tipo.cocinar(empanadaCel);
	}

	@Override
	public Comida cocinar(EmpanadaHipertensa empanadaHip) {
		// TODO Auto-generated method stub
		return tipo.cocinar(empanadaHip);
	}

	@Override
	public Comida cocinar(Pan pan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comida cocinar(PanCeliaco panCel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comida cocinar(PanHipertenso panHip) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
