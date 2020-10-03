package modelo;

import java.util.ArrayList;

public interface IGuardar {
	
	public abstract void guardar(ArrayList datosAGuardar);

}
//Hasta ahora hay 2 formas de guardar: en disco y en un objeto remoto
//ambas implementan la interface IGuardar.

//vamos a crear un sencillo proxy para q se fije si al momento del guardado
//hay conexion o no para ver donde guardar.
