package comensales;

import comidas.Comida;
import comidas.Empanada;
import comidas.EmpanadaCeliaca;
import comidas.EmpanadaHipertensa;
import comidas.Pan;
import comidas.PanCeliaco;
import comidas.PanHipertenso;

public class Hipertenso extends Comensal {

	@Override
	public void comer(Comida comida) throws ComensalCeliacoError, ComensalHipertensoError {
		// TODO Auto-generated method stub		
	}

	@Override
	public void comer(Pan pan) throws ComensalCeliacoError, ComensalHipertensoError {
		throw new ComensalHipertensoError();		
	}

	@Override
	public void comer(Empanada empanada) throws ComensalCeliacoError, ComensalHipertensoError {
		throw new ComensalHipertensoError();		
	}

	@Override
	public void comer(EmpanadaCeliaca emp) throws ComensalCeliacoError, ComensalHipertensoError {
		throw new ComensalHipertensoError();		
	}

	@Override
	public void comer(PanCeliaco pan) throws ComensalCeliacoError, ComensalHipertensoError {
		throw new ComensalHipertensoError();		
	}

	@Override
	public void comer(PanHipertenso pan) throws ComensalCeliacoError, ComensalHipertensoError {
		this.caloriasConsumidas += pan.serComida();
	}

	@Override
	public void comer(EmpanadaHipertensa emp) throws ComensalCeliacoError, ComensalHipertensoError {
		this.caloriasConsumidas += emp.serComida();		
	}

	

}
