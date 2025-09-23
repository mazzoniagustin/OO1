package ar.edu.unlp.info.oo1.Presupuestos_Ej3;

import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto (String unCliente) {
		this.cliente = unCliente;
		this.fecha = LocalDate.now();
		this.items = new LinkedList<Item>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		return this.items.stream().mapToDouble(Item::getCosto).sum();
	}

	public String getCliente() {
		return this.cliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

}
