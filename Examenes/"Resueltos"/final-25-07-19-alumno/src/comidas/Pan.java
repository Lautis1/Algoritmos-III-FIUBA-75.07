package comidas;

import especialistas.Especialista;

public class Pan implements Comida {
	protected int calorias;
	
	public Pan() {
		this.calorias = 10;
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
