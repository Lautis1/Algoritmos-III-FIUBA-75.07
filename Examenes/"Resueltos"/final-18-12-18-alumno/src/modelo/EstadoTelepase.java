package modelo;

public interface EstadoTelepase {
	public abstract int aplicarDescuento(Transporte transporte);
	public abstract int aplicarDescuento(Auto auto);
	public abstract int aplicarDescuento(Camion camion);
	

}
