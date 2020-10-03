package modelo;

public class Gorrion implements Cantante, Volador {
	protected String CANTO = "pio pio";
	protected int COEFVUELO = 50;
	
	@Override
	public String cantar() {
		
		return this.CANTO;
	}

	@Override
	public int volar() {
		// TODO Auto-generated method stub
		return this.COEFVUELO;
	}
}

	/*@Override
	public String cantar() {
		return "pio pio";
	}

	@Override
	public int volar() {
		return 50;
	}

	@Override
	public int correr(Superficie superficie) {
		// no sé correr, se volar
		return -1;
	}

}*/
	
