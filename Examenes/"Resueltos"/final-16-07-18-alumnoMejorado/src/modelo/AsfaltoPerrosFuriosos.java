package modelo;

public class AsfaltoPerrosFuriosos implements Superficie {

	@Override
	public int serCirculadaPor(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculo.circularEn(this);
	}

}
