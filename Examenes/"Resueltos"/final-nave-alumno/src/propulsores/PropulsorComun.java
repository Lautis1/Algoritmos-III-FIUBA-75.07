package propulsores;

public class PropulsorComun extends PropulsorAbstracto {

	@Override
	public int moverNave() {
		this.combustible = (this.combustible - 10);
		return 10;
	}

}
