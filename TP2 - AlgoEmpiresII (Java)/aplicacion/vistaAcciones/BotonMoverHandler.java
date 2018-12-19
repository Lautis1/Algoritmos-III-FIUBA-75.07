package vistaAcciones;


import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import vista.VistaModelo;
import juego.Juego;
import areaJuego.Posicion;
import unidades.Unidad;


public class BotonMoverHandler implements EventHandler<ActionEvent> {

    VistaModelo vista;
    Posicion posicion;
    Unidad seleccionada;
    

    public BotonMoverHandler(VistaModelo vista, Unidad seleccionada, Posicion posicion) {
       this.posicion = posicion;
       this.seleccionada = seleccionada;
    }

    @Override
    public void handle(ActionEvent evento) {
         seleccionada.cambiarPosicion(posicion);
         this.vista.update();
         
     }
        
    }
    


