package ar.edu.unlp.info.oo1.FigurasYCuerpos;

public class Figura3D {
	private Figura caraBasal;
	private double altura;
	
	public Figura3D() {
		
	}
	
	public void setAltura(double unaAltura) {
		this.altura = unaAltura;
	}
	
	public void setCaraBasal(Figura caraB) {
		this.caraBasal = caraB;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getVolumen() {
		return (this.caraBasal.getArea()) * this.getAltura();
	}
	
	public double getSuperficieExterior() {
		double suma = 0.0;
		suma = 2 * this.caraBasal.getArea();
		suma+= this.caraBasal.getPerimetro() * this.getAltura();
		return suma;
	}
	
}
