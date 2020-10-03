package fiuba.algo3.tiendaonline;

public class CuponMerryChristmas extends Cupon {
	protected double descuentoAAplicar = 0.75; //Descuento del 25%

	@Override
	public double obtenerDescuento() {
		// TODO Auto-generated method stub
		return this.descuentoAAplicar;
	}
	
	

}
