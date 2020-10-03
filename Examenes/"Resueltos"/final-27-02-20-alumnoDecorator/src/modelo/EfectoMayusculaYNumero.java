package modelo;

public class EfectoMayusculaYNumero extends EfectoDecorator {
	private String numeroAAgregar;
	
	public EfectoMayusculaYNumero(Efecto efectoBase, String numero) {
		super(efectoBase);
		this.numeroAAgregar = numero;
	}

	@Override
	public String aplicarA(String unString) {
		
		return (new EfectoNumero(numeroAAgregar)).aplicarA(this.getEfectoADecorar().aplicarA(unString));
	}

}
