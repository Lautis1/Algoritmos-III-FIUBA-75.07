package modelo;

public class KaiohKenx4 implements TipoKaiohken{
	private int turnos = 2;

	@Override
	public void atacar(Vegeta vegeta, Ataque ataque, Goku goku) {
		if(this.turnos == 0) throw new SeGastaronTodosLosTurnosError();
		ataque.generarAtaque(vegeta, goku);
		goku.serAtacado(300);
		this.turnos -= 1;
		
	}

	@Override
	public double cuantoRestas() {
		// TODO Auto-generated method stub
		return 800;
	}

}
