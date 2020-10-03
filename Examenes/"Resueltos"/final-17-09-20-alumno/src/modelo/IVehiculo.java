package modelo;


public interface IVehiculo {
	public void cargar(Carga carga);
	public void cargar(Helatodo heladerita);
	public void cargar(Portabici portabici);
	public void cargar(Bicicleta bici);
	public Carga descargar();
	
}
