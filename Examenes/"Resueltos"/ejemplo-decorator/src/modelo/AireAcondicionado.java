package modelo;

public class AireAcondicionado extends AutoDecorador {
	
	public AireAcondicionado(Vendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return getVendible().getDescripcion() + "Con aire";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return getVendible().getPrecio() + 5000;
	}
	
}
