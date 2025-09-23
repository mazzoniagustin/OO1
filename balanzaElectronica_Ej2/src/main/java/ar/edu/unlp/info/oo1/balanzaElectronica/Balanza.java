package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public Ticket emitirTicket() {
		Ticket t1 = new Ticket(this.cantidadDeProductos, this.getPesoTotal(), this.getPrecioTotal());
		return t1;
		
	}
	
	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0.0;
		pesoTotal = 0.0;
	}
	
	public void agregarProducto(Producto unProd) {
		this.cantidadDeProductos++;
		this.precioTotal += unProd.getPrecio();
		this.pesoTotal += unProd.getPeso();
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}

	
}
