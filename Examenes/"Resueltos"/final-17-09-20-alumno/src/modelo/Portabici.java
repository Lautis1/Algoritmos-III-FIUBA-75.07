package modelo;

public class Portabici implements Carga{

	@Override
	public void serCargadaEn(IVehiculo vehiculo) {
		vehiculo.cargar(this);		
	}

}
