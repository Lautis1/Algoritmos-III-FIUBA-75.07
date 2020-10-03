package modelo;

public class Contexto {
	
	private ComisionStrategy comision;
	
	public Contexto(ComisionStrategy comision) {
		this.comision = comision;
	}
	
	public double ejecutarStrategy(double monto) {
		return comision.aplicarComision(monto);
	}
}
