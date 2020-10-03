package instrumentos;

public abstract class Material {
	protected int coefAmplificacionGuitarra;
	protected int coefAmplificacionPiano;
	protected int coefAmplificacionCharango;
	
	public int getCoefAmplificacionGuitarra() {
		return this.coefAmplificacionGuitarra;
	}
	
	public int getCoefAmplificacionPiano() {
		return this.coefAmplificacionPiano;
	}
	
	public int getCoefAmplificacionCharango() {
		return this.coefAmplificacionCharango;
	}
}
