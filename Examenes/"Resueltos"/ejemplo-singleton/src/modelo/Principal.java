package modelo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstitutoEducativo ie1 = InstitutoEducativo.getInstancia();
		ie1.setNombre("Lautaro");
		System.out.println("1: "+ ie1.getNombre());
		
		InstitutoEducativo ie2 = InstitutoEducativo.getInstancia();
		System.out.println("2: "+ ie2.getNombre());
		
		InstitutoEducativo ie3 = InstitutoEducativo.getInstancia();
		ie3.setNombre("Giachino");
		System.out.println("3: "+ ie3.getNombre());
		
	}

}
