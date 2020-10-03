package modelo;

public class EfectoVoltearYPrimeraMayuscula extends EfectoDecorator {

	public EfectoVoltearYPrimeraMayuscula(Efecto efectoVoltear) {
		super(efectoVoltear);
	}

	@Override
	public String aplicarA(String unString) {
		return (new EfectoMayusculaInicial()).aplicarA(this.getEfectoADecorar().aplicarA(unString));
	}

}
