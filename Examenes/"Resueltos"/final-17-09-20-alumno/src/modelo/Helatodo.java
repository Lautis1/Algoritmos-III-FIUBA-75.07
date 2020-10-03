package modelo;

public class Helatodo implements Carga {

	@Override
	public void serCargadaEn(IVehiculo vehiculo) {
		vehiculo.cargar(this);		
	}

}
