package comidas;

public class PanHipertenso extends Pan implements Comida {
	public PanHipertenso() {
		this.calorias = (int) (10-(10*0.1));
	}
}
