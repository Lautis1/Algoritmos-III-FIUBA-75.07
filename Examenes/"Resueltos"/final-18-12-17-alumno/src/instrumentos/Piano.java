package instrumentos;

public class Piano extends Instrumento {
	protected int intensidadSonido = 50;
	
	public Piano(Material material) {
		this.material = material;
	}
	
	@Override
	public int sonar() {
		return (this.intensidadSonido + this.material.getCoefAmplificacionPiano());
	}
	
}
