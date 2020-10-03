package fiuba.algo3.tiendaonline;

public class EnvioLocal extends Envio {
	protected double recargoEnvioLocal = 1.1;

	@Override
	public double aplicarRecargo(double precioDelPedido) {
		// TODO Auto-generated method stub
		return precioDelPedido * this.recargoEnvioLocal;
	}
	
    
}
