package modelo;

import java.util.ArrayList;

public class GuardarDatos implements IGuardar {

	@Override
	public void guardar(ArrayList datosAGuardar) {
		// TODO Auto-generated method stub
		if (ConnectionManager.estaConectado())
			new GuardarEnObjRemoto().guardar(datosAGuardar);
		else
			new GuardarEnDisco().guardar(datosAGuardar);
	}

}
