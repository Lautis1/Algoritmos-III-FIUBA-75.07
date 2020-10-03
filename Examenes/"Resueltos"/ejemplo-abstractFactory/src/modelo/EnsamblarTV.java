package modelo;

public class EnsamblarTV {
	
	public EnsamblarTV(TvAbstractFactory factory) {
		Color color = factory.crearColor();
		TV tv = factory.crearTV();
		color.colorear(tv);
	}
}
