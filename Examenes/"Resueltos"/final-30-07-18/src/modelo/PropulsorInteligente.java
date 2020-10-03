package modelo;

public class PropulsorInteligente extends Propulsor {
	
	public int avanzar() {
		if (this.nivelCombustible == 0) return 0;
		if (this.nivelCombustible < 50) {
			this.nivelCombustible -= 5;
			return this.coefDesplazamiento/2;			
		}
		this.nivelCombustible -= 10;
		return this.coefDesplazamiento;
		
	}

}
