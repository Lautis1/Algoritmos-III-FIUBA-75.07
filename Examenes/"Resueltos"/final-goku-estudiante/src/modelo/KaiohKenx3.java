package modelo;

public class KaiohKenx3 implements TipoKaiohken{
	
	private double cantidadVidaARestar = 0.15;
	private int turnos = 3;
	
	
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
