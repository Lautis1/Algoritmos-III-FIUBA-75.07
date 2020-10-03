package main.ar.edu.fiuba.algoiii;

import java.util.ArrayList;

public class FoolMatic {
	
	private ArrayList<Partido> partidos;
	private static final int votosRobados = 10;
	
	public FoolMatic() {
		
		this.partidos = new ArrayList<>();
		this.partidos.add(PartidoPoR.obtenerInstancia());
		this.partidos.add(PartidoTordos.obtenerInstancia());		
	}
	
	public void votar(String leyendaPartido) {
		votar(leyendaPartido, 1);
	}
	
	public void votar(String leyendaPartido, int numeroVotos) {
		Partido partido = obtenerPartido(leyendaPartido);
		if(pierdePorMucho(partido)) partido.recibirVotos(numeroVotos + votosRobados);
		else partido.recibirVotos(numeroVotos);
	}
	
	private Partido obtenerPartido(String nombre) {
		for(int i=0; i < partidos.size(); i++) {
			Partido partido = partidos.get(i);
			if(partido.seLlama(nombre)) return partido;
		}
		return null;
	}
	
	public int escrutinio(String leyendaPartido) {
		return obtenerPartido(leyendaPartido).escrutar();
	}
	
	protected boolean pierdePorMucho(Partido partido) {
		for(int i = 0; i < partidos.size(); i++) {
			Partido otroPartido = partidos.get(i);
			if(partido == otroPartido) continue;
			int votos = partido.escrutar();
			if(votos < otroPartido.escrutar()*10) return true;
		}
		return false;
	}
	
	public void resetearVotos() {
		for(int i=0; i < partidos.size(); i++) {
			partidos.get(i).resetear();
		}
	}
	
	
	
	
	
    /*public int votosPartidoPoR = 0;
    public int votosPartidoTordos = 0;

    public void votar(String leyendaPartido) {
        if (leyendaPartido.equals("Tordos")) {
            votosPartidoTordos = votosPartidoTordos + 1;
        }
        if (leyendaPartido.equals("PoR")) {
            votosPartidoPoR = votosPartidoPoR + 1;
        }
    }

    public int escrutinio(String leyendaPartido) {
        if (leyendaPartido.equals("Tordos")) {
            return votosPartidoTordos;
        }

        return votosPartidoPoR;

    }

    public void votar(String leyendaPartido, int numeroVotos) {
        if (leyendaPartido.equals("Tordos")) {
            votosPartidoTordos = votosPartidoTordos + numeroVotos;
        }
        if (leyendaPartido.equals("PoR")) {
            votosPartidoPoR = votosPartidoPoR + numeroVotos;
        }

        if ( esLaDiferenciaTordosDiezVecesMayoraPoR(votosPartidoTordos, votosPartidoPoR)) {
            votosPartidoPoR += 10;
        }
    }

    private boolean esLaDiferenciaTordosDiezVecesMayoraPoR(int votosPartidoTordos, int votosPartidoPoR) {
        return ( votosPartidoTordos > votosPartidoPoR * 10);
    }*/
}
