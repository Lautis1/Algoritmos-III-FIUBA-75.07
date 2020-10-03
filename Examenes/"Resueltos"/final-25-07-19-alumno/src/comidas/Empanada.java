package comidas;

import especialistas.Especialista;

public class Empanada implements Comida {
	protected int calorias;
	
	public Empanada() {
		this.calorias = 15;
	}
	
	@Override
	public int serComida() {
		return this.calorias;
	}

	@Override
	public Comida serCocinadaPor(Especialista especialista) {
		// TODO Auto-generated method stub
		return especialista.cocinar(this);
	}

}
