package modelo;

public class ConTelepase implements EstadoTelepase {
	private int fraccionCamion = 4;
	private int fraccionAuto = 2;
	
	@Override
	public int aplicarDescuento(Transporte transporte) {
	
		return 1;
	}

	@Override
	public int aplicarDescuento(Auto auto) {
		
		return this.fraccionAuto;
	}

	@Override
	public int aplicarDescuento(Camion camion) {

		return this.fraccionCamion;
	}

}
