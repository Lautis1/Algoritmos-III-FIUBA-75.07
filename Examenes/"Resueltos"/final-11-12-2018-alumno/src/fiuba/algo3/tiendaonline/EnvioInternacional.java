package fiuba.algo3.tiendaonline;

public class EnvioInternacional extends Envio {
	protected double recargoEnvioInternacional = 1.2;

	@Override
	public double aplicarRecargo(double precioDelPedido) {
		return precioDelPedido*this.recargoEnvioInternacional;
	}
	
  
}
