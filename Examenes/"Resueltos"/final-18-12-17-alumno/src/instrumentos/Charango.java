package instrumentos;

public class Charango extends Instrumento {
	protected int intesidadSonido = 10;
	
	public Charango(Material material) {
		this.material = material;
	}
	
	@Override
	public int sonar() {
		return (this.intesidadSonido*this.material.getCoefAmplificacionCharango());
	}
	


}
