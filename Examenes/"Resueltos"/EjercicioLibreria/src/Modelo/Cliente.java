package Modelo;

import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private EstadoEnSistema estado;
	private ArrayList<Compra> cuentaCte = new ArrayList<Compra>();
	//private ArrayList<Suscripcion> suscripciones = new ArrayList<Suscripcion>();
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.estado = new NoRegistrado();
	}
	
	public void registrarEnSistema() {
		this.estado = new Registrado();
	}
	
	public void hacerCompra(Compra compra) {
		this.cuentaCte.add(compra);
	}
	
	public double pagarMes(int mes) {
		
		double montoAPagar = 0;
		for(Compra compra: cuentaCte) {
			if(compra.getMesDeCompra() == mes) {
				montoAPagar += compra.pagar();
			}
		}
		return montoAPagar * estado.influirEnPrecio();
	}
	
	
}
