package modelo;

public class Auto implements Vehiculo {
	
	@Override
	public int circularEn(Superficie superficie) {
		// TODO Auto-generated method stub
		return superficie.serCirculadaPor(this);
	}

	@Override
	public int circularEn(AsfaltoLiso asfalto) {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public int circularEn(AsfaltoPerrosFuriosos asfaltoPerros) {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public int circularEn(AsfaltoLomaDeBurro asfaltoLoma) {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int circularEn(CalleEmbarrada calle) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//boolean auto4x4;
	
	/*public Auto( Boolean TRADICIONAL) {
		this.auto4x4 = TRADICIONAL;
	}*/

}
