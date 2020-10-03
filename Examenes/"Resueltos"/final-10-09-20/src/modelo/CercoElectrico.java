package modelo;

public class CercoElectrico extends ComponenteElectrico {
	private double metrosAbarcados;
	
	public CercoElectrico(double paraCuantosMetros) {
		this.metrosAbarcados = paraCuantosMetros;
	}

	@Override
	public double cuantoGasto() {
		// TODO Auto-generated method stub
		return this.metrosAbarcados * this.precioKw;
	}
}
