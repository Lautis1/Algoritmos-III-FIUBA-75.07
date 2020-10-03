package modelo;

public class Vegeta extends Atacable{
	
	public Vegeta() {
		this.vida = 6000;
		this.ataquesPermitidos.put("GalickHo", new GalickHo());
		this.ataquesPermitidos.put("BolaDeEnergia", new BolaDeEnergia());
	}

	@Override
	public void atacar(Atacable atacable, Ataque ataque, Atacable atacante) {
		this.atacar(atacable, ataque,this);		
	}

	@Override
	public void atacar(Goku goku, Ataque ataque, Atacable atacante) {
		if(! this.ataquesPermitidos.containsKey(ataque.getNombre())) throw new VegetaNoPuedeUsarEsteAtaqueError();
		ataque.generarAtaque(goku,this);
		
	}

	@Override
	public void atacar(Vegeta vegeta, Ataque ataque, Atacable atacante) {
		throw new VegetaNoPuedeAtacarseASiMismoError();
		
	}

	@Override
	protected double danioPorKaiohken(double vidaEnemigo) {
		// TODO Auto-generated method stub
		throw new VegetaNoSabeUsarKaiohKen();
	}



}
