package ar.edu.unlp.info.oo1.balanzaMejorada_Ej4;
import java.util.LinkedList;
import java.util.List;

public class Balanza {
    private List<Producto> lista;
    private double pesoTotal;
    private double precioTotal;

    public Balanza() {
        this.ponerEnCero();
    }

    public Ticket emitirTicket() {
        Ticket t1 = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
        return t1;
    }

    public void ponerEnCero() {
        this.lista = new LinkedList<Producto>();
        this.pesoTotal = 0;
        this.precioTotal = 0;
    }

    public void agregarProducto(Producto unProd) {
        this.lista.add(unProd);
        this.pesoTotal += unProd.getPeso();
        this.precioTotal += unProd.getPrecio();
    }

    public int getCantidadDeProductos() {
        return this.lista.size();
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public List<Producto> getProductos() {
        return this.lista;
    }
}
