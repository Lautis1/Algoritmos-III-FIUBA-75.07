package modelo;

public abstract class EfectoDecorador implements Efecto {
	private Efecto efectoAgregado;
	private Efecto efecto;
	
	public EfectoDecorador(Efecto efecto, Efecto efectoAAgregar) {
		this.efecto = efecto;
		this.efectoAgregado = efectoAAgregar;
	}
	
	public abstract String decoradorHaceAlgo(String string);
	
	protected Efecto getEfecto() {
		return this.efecto;
	}
	
	protected Efecto getEfectoExtra() {
		return this.efectoAgregado;
	}

}
