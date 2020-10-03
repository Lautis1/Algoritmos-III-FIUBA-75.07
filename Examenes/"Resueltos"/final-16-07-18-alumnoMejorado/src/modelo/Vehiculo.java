package modelo;

public interface Vehiculo {
	
	public abstract int circularEn(Superficie superficie);
	public abstract int circularEn(AsfaltoLiso asfalto);
	public abstract int circularEn(AsfaltoPerrosFuriosos asfaltoPerros);
	public abstract int circularEn(AsfaltoLomaDeBurro asfaltoLoma);
	public abstract int circularEn(CalleEmbarrada calle);
}
