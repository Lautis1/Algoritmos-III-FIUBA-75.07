package modelo;

public class ComisionFull implements ComisionStrategy {

	@Override
	public double aplicarComision(double monto) {
		// TODO Auto-generated method stub
		return monto * 0.50;
	}

}
