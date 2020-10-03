package main;

public class Thanos extends ObjetoVenger {
	//private EstadoGemas estado;

    public Thanos() {
        this.puntosDeVida = 250;
        //this.tieneGemasDelInfinito = false;
    }
    @Override
	public void atacar(ObjetoVenger otroAvenger) {
		// TODO Auto-generated method stub
		otroAvenger.recibirDanio(15);
		
	}

	@Override
	public void recibirDanio(int danio) {
		// TODO Auto-generated method stub
		this.puntosDeVida -= danio;
		
	}

    /*public double getPuntosDeVida() {
        return this.puntosDeVida;
    }*/

    /*public void recibirDanio(double danio) throws Exception {
        this.puntosDeVida -= danio;
    }*/

    /*public void atacar(ObjetoVenger ironMan) {
        ironMan.recibirDanio(this.tieneGemasDelInfinito ? 60 : 15);
    }

    public void conseguirLasGemasDelInfinito() {
        this.tieneGemasDelInfinito = true;
    }*/
}
