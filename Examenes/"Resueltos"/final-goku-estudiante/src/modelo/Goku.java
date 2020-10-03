package modelo;



public class Goku extends Atacable{
	private TipoKaiohken kaiohken;
	
	public Goku(TipoKaiohken kaiohken) {
		this.vida = 5000;
		this.kaiohken = kaiohken;
		this.ataquesPermitidos.put("BolaDeEnergia", new BolaDeEnergia());
		this.ataquesPermitidos.put("KameHameHa", new KameHameHa());
		
	}

	@Override
	public void atacar(Atacable atacable, Ataque ataque, Atacable atacante) {
		this.atacar(atacable, ataque,this);
		
	}

	@Override
	public void atacar(Vegeta vegeta, Ataque ataque, Atacable atacante) {
		if(! this.ataquesPermitidos.containsKey(ataque.getNombre())) throw new GokuNoPuedeUsarEsteAtaqueError();
		this.kaiohken.atacar(vegeta,ataque, this);
		
		
	}

	@Override
	public void atacar(Goku goku, Ataque ataque, Atacable atacante) {
		throw new GokuNoPuedeAtacarseASiMismoError();
		
	}
	public double danioPorKaiohken(double vidaEnemiga) {
		return vidaEnemiga*this.kaiohken.cuantoRestas();
	}
	

}
