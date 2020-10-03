package modelo;

public class PlanetaAgricola implements Planeta {

    private int produccionPorHabitante;
    private int poblacion;

    public PlanetaAgricola(int produccionPorHabitante, int poblacion) {
        this.produccionPorHabitante = produccionPorHabitante;
        this.poblacion = poblacion;
    }

    public int producir() {
        return this.produccionPorHabitante * this.poblacion;
    }

	@Override
	public void calcularImpuesto(Imperio imperio) {
		// TODO Auto-generated method stub
		imperio.calcularImpuesto(this, this.producir());
	}
}
