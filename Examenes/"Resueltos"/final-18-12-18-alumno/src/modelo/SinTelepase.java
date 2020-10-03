package modelo;

public class SinTelepase implements EstadoTelepase {
	
	@Override
	public int aplicarDescuento(Transporte transporte) {
		
		return 1;
	}

	@Override
	public int aplicarDescuento(Auto auto) {
		
		return 1;
	}

	@Override
	public int aplicarDescuento(Camion camion) {
		
		return 1;
	}

}
