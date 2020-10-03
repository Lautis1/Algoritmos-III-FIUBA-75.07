package modelo;

public class KaiohKen implements TipoKaiohken{
	private double cantidadVidaARestar = 0.05;
	private int turnos = 4;
	
	@Override
	public void atacar(Vegeta vegeta, Ataque ataque, Goku goku) {
		if(this.turnos == 0) throw new SeGastaronTodosLosTurnosError();
		ataque.generarAtaque(vegeta, goku);
		this.turnos -= 1;
		
	}

	@Override
	public double cuantoRestas() {
		// TODO Auto-generated method stub
		return this.cantidadVidaARestar;
	}

}
