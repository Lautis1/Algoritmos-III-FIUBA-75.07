package modelo;

public class InstitutoEducativo {
	//esta instancia es la q se instancia por unica vez
	//y se devuelve al cliente.
	private static InstitutoEducativo instancia;
	
	//atributo para probar
	private String nombre;
	
	//se privatiza el constructor para q no se pueda hacer
	//un new InstituoEducativo desde un lugar ajeno
	//a esta clase
	private InstitutoEducativo() {}
	
	
	//para usar la unica instancia de la clase, los clientes deberan
	//convocar al metdo getInstancia.
	public static InstitutoEducativo getInstancia() {
		if(instancia == null) instancia = new InstitutoEducativo();
		return instancia;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//si hay un atributo, tendra el mismo valor cada vez q se llame al 
	//metodo getInstancia,salvo q lo modifiques con un setter.
}
