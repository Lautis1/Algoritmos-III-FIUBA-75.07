package modelo;

public class CabinaDePeaje {
	private int precioMinimo = 2;

	public int cobrarPeaje(Transporte transporte) {
		
		return precioMinimo*transporte.calcularCosto();
	}
}
