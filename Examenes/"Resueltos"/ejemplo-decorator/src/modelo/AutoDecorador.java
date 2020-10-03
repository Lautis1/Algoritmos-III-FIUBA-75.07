package modelo;

public abstract class AutoDecorador implements Vendible {
	private Vendible vendible;
	
	public AutoDecorador(Vendible vendible) {
		this.vendible = vendible;
	}
	
	public Vendible getVendible() {
		return vendible;
	}
}
