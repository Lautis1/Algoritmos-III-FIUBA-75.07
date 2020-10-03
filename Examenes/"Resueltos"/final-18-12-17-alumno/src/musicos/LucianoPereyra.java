package musicos;

import instrumentos.Charango;

public class LucianoPereyra extends Musico {

	public int tocar(Charango charango) {
		return charango.sonar();
	}
}

	/*public int tocar(Object i){
		try {
			Charango c = (Charango) i;
			
			if (c.material == "Madera"){
				return c.decibeles * 2;
			}
		
			if (c.material == "Plastico"){
				return c.decibeles;
			}
			
		}catch(ClassCastException e2){
			System.out.println("No se tocar eso...");
		}			
		
		return 0;
	}
}
*/