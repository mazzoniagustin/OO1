package ar.edu.unlp.info.oo1.FigurasYCuerpos;

public class Cuadrado implements Figura{
	private double lado;
	
	
	public Cuadrado() {
		
	}
	
	public void setLado(double unLado) {
		this.lado = unLado;
	}
	
	public double getPerimetro() {
		return getLado() * 4;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getArea() {
		return Math.pow(lado, 2.0);
	}
	
}
