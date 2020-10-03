package modelo;

public class CercoElectrico implements ComponenteHogareño {
	private double metrosAbarcados;
	private final int PRECIOKW = 10;
	
	public CercoElectrico(double paraCuantosMetros) {
		this.metrosAbarcados = paraCuantosMetros;
	}

	@Override
	public double cuantoGasto() {
		return this.metrosAbarcados * this.PRECIOKW;
	}
}
