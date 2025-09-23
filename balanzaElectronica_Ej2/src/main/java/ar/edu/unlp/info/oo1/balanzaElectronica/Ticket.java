package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantTotalProd;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket (int unaCant, double unPeso, double unPrecio) {
		this.cantTotalProd = unaCant;
		this.pesoTotal = unPeso;
		this.precioTotal = unPrecio;
		this.fecha = LocalDate.now();
	}
	
	public int getCantidadDeProductos() {
		return this.cantTotalProd;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public int getCantTotalProd() {
		return cantTotalProd;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}

	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
	
	public String toString() {
		String ticket = "Fecha emitida: " + this.fecha.toString() + "\n" + "Cantidad de productos comprados: "
				+ this.cantTotalProd + "\n" + "Peso total en productos: " + this.pesoTotal + "\n"
				+ "Total a pagar sin impuesto: " + this.precioTotal + " Total a pagar con impuesto: " + this.impuesto();
		return ticket;
	}

	

}
