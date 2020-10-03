package modelo;

public class AsfaltoLiso implements Superficie {

	@Override
	public int serCirculadaPor(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculo.circularEn(this);
	}

}
