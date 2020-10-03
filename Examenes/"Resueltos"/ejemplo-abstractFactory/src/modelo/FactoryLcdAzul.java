package modelo;

public class FactoryLcdAzul extends TvAbstractFactory {

	@Override
	public TV crearTV() {
		// TODO Auto-generated method stub
		return new LCD();
	}

	@Override
	public Color crearColor() {
		// TODO Auto-generated method stub
		return new Azul();
	}

}
