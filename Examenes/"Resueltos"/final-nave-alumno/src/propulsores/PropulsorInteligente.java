package propulsores;

public class PropulsorInteligente extends PropulsorAbstracto {

	@Override
	public int moverNave() {
		int desplazamiento;
		if (this.combustible > 50) {
			desplazamiento = 10;
		}else {
			desplazamiento = 5;
		}
		this.combustible = (this.combustible - desplazamiento);
		return desplazamiento;
	}

}
