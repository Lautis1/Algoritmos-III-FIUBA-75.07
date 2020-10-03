package modelo;

public interface Corredor {
	
	public abstract int correr(Superficie superficie);
	public abstract int correr(SuperficieHielo hielo);
	public abstract int correr(SuperficieBarro barro);
	public abstract int correr(SuperficiePista pista);

}
