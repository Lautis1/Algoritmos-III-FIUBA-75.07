package modelo;

public class Avestruz implements Corredor{
	
	private static final int COEFBARRO = 70;
	private static final int COEFHIELO = 0;
	private static final int COEFPISTA = 70;


	@Override
	public int correr(SuperficieHielo hielo) {
		
		return Avestruz.COEFHIELO;
	}

	@Override
	public int correr(SuperficieBarro barro) {
	
		return Avestruz.COEFBARRO;
	}

	@Override
	public int correr(Superficie superficie) {
		
		return superficie.deslizar(this);
	}

	@Override
	public int correr(SuperficiePista pista) {
		
		return Avestruz.COEFPISTA;
	}
}

	/*@Override
	public String cantar() {
		throw new NoVueloNiCantoNadaError();
	}

	@Override
	public int volar() {
		throw new NoVueloNiCantoNadaError();
	}
	
	@Override
	public int correr(Superficie superficie) {
		
		if (superficie == Superficie.PISTA_ATLETISMO) {
			// corriendo soy un/a champion 70 km/h
			return 70;
		}
		
		if (superficie == Superficie.BARRO) {
			// Nada me detiene !!
			return 70;
		}
		
		if (superficie == Superficie.HIELO) {
			// En realidad el hielo si.
			return 0;
		}
		
		return -1;
	}

}*/
	
