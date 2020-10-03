package modelo;

public class Moto implements Vehiculo {

		Superficie superficie;

		@Override
		public void ponerVehiculoEn(Superficie superficie) {
			this.superficie = superficie;
			
		}

		@Override
		public double getVelocidad() {
			return Vehiculo.VELOCIDADMAXIMA*this.superficie.getFactorVelocidadMoto();
		}
}
