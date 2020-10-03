package naves;

public interface Atacable {

	boolean tieneVida(int vida);

	void atacar(Atacable otroAtacable);

	void activarCamuflaje();

	void recibirAtaque(int danio);

	void desactivarCamuflaje();

}
