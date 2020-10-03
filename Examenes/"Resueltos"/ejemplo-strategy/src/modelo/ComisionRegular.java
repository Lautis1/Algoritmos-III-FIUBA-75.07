package modelo;

public class ComisionRegular implements ComisionStrategy {

	@Override
	public double aplicarComision(double monto) {
		// TODO Auto-generated method stub
		return monto * 0.10;
	}
	

}
