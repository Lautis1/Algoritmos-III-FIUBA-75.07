package fiuba.algo3.tiendaonline;

public class CuponBlackFriday extends Cupon {
	protected double descuentoAAplicar = 0.15; //descuento del 85%

	@Override
	public double obtenerDescuento() {
		// TODO Auto-generated method stub
		return this.descuentoAAplicar;
	}
	
	
}
