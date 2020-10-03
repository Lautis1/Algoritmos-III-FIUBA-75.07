package modelo;

public class AbelPintos implements Corredor, Cantante {
	
	protected String CANTO = "vas a entrar sin pedirme la llave...";
	protected int COEFHIELO = 0;
	protected int COEFBARRO = 2;
	protected int COEFPISTA = 15;
	
	@Override
	public String cantar() {
		// TODO Auto-generated method stub
		return this.CANTO;
	}

	@Override
	public int correr(Superficie superficie) {
		
		return superficie.deslizar(this);
	}

	@Override
	public int correr(SuperficieHielo hielo) {
	
		return this.COEFHIELO;
	}

	@Override
	public int correr(SuperficieBarro barro) {
		
		return this.COEFBARRO;
	}

	@Override
	public int correr(SuperficiePista pista) {
		
		return this.COEFPISTA;
	}
}

	/*@Override
	public String cantar() {
		return "vas a entrar sin pedirme la llave...";
	}

	@Override
	public int volar() {
		// y cero... porque en realidad no sé volar, así que no subo nada
		return 0;
	}

	@Override
	public int correr(Superficie superficie) {
		
		if (superficie == Superficie.PISTA_ATLETISMO) {
			// unos 15 km/h
			return 15;
		}
		
		if (superficie == Superficie.BARRO) {
			//medio lento pero se puede
			return 2;
		}
		
		if (superficie == Superficie.HIELO) {
			//olvidate, me caigo.
			return 0;
		}
		
		return -1;
	}

}
*/
