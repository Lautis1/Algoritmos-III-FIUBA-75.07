package modelo;

public class FactoryPlasmaAmarillo extends TvAbstractFactory {

	@Override
	public TV crearTV() {
		// TODO Auto-generated method stub
		return new Plasma();
	}

	@Override
	public Color crearColor() {
		// TODO Auto-generated method stub
		return new Amarillo();
	}

}
