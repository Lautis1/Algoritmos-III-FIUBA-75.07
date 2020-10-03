package modelo;

public class PropulsorTanqueLleno extends Propulsor {
	
	public int avanzar() {
		
		if(this.nivelCombustible == 0) return 0;
		this.nivelCombustible -= this.gastoCombustible;
		return this.coefDesplazamiento;		
	}

}
