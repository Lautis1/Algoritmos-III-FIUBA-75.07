package fiuba.algo3.tiendaonline;

public class CuponCyberMonday extends Cupon {
	protected double descuentoAAplicar = 0.5; //Descuento del 50%

	@Override
	public double obtenerDescuento() {
		// TODO Auto-generated method stub
		return this.descuentoAAplicar;
	}
	
	
}
