package modelo;

public class Bicicleta implements Carga{

	@Override
	public void serCargadaEn(IVehiculo vehiculo) {
		vehiculo.cargar(this);
	}

}
