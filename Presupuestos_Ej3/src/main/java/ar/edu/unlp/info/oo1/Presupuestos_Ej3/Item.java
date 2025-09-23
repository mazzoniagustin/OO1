package ar.edu.unlp.info.oo1.Presupuestos_Ej3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String detalle, int cantidad, double costo) {
		this.detalle = detalle;
		this.costoUnitario = costo;
		this.cantidad = cantidad;
	}
	
	
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public double getCosto() {
		return this.cantidad * this.costoUnitario;
	}

}
