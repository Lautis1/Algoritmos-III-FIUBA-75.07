package modelo;

public class Plasma extends TV {
	private double anguloVision;
	private double tiempoRespuesta;
	
	public Plasma(String marca, int pulgadas, String color, double precio, double angulo, double tr) {
		super(marca, pulgadas, color, precio);
		this.anguloVision = angulo;
		this.tiempoRespuesta = tr;
	}
	
	public Plasma() {
		setDescripcion("PLASMA");
	}
}
