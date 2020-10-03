package comensales;

import comidas.Comida;
import comidas.Empanada;
import comidas.EmpanadaCeliaca;
import comidas.EmpanadaHipertensa;
import comidas.Pan;
import comidas.PanCeliaco;
import comidas.PanHipertenso;

public class NoCeliaco extends Comensal {

	@Override
	public void comer(Comida comida) throws ComensalCeliacoError, ComensalHipertensoError {
	}

	@Override
	public void comer(Pan pan) throws ComensalCeliacoError, ComensalHipertensoError {
		this.caloriasConsumidas += pan.serComida();		
	}

	@Override
	public void comer(Empanada empanada) throws ComensalCeliacoError, ComensalHipertensoError {
		this.caloriasConsumidas += empanada.serComida();		
	}

	@Override
	public void comer(EmpanadaCeliaca emp) throws ComensalCeliacoError, ComensalHipertensoError {
		this.caloriasConsumidas += emp.serComida();		
	}

	@Override
	public void comer(PanCeliaco pan) throws ComensalCeliacoError, ComensalHipertensoError {
		this.caloriasConsumidas += pan.serComida();		
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
