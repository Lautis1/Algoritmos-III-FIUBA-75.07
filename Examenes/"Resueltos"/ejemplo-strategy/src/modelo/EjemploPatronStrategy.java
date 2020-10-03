package modelo;

public class EjemploPatronStrategy {
	
	public static void main(String[] args) {
		
		ComisionStrategy comision = getStrategy(1000);
		Contexto contexto = new Contexto(comision);
		System.out.println("Comision para 1000d = " + contexto.ejecutarStrategy(1000));
		
		comision = getStrategy(500);
		contexto = new Contexto(comision);
		System.out.println("Comision para 500d = "+ contexto.ejecutarStrategy(500));
		
		comision = getStrategy(100);
		contexto = new Contexto(comision);
		System.out.println("Comision para 100d = "+ contexto.ejecutarStrategy(100));
	}
	
	private static ComisionStrategy getStrategy(double monto) {
		ComisionStrategy strategy;
		if(monto >= 1000) strategy = new ComisionFull();
		else if(monto >= 500 && monto <= 999) strategy = new ComisionNormal();
		else strategy = new ComisionRegular();
		return strategy;
	}
	
	
	
}
