package instrumentos;

public class GuitarraCriolla extends Instrumento {
	protected int intensidadSonido = 20;
	
	public GuitarraCriolla(Material material) {
		this.material = material;
	}
	
	@Override
	public int sonar() {
		return (this.intensidadSonido - this.material.getCoefAmplificacionGuitarra());
	}


}
