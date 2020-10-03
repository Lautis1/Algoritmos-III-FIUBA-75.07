package modelo;

public class SinKaiohken implements TipoKaiohken {
	private double cantidadVidaARestar = 0;
	@Override
	public void atacar(Vegeta vegeta, Ataque ataque, Goku goku) {
		ataque.generarAtaque(vegeta, goku);
		
	}
	@Override
	public double cuantoRestas() {
		// TODO Auto-generated method stub
		return this.cantidadVidaARestar;
	}

}
