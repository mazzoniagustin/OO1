package ar.edu.unlp.info.oo1.FigurasYCuerpos;

public class Circulo implements Figura {
	private double radio;
	
	public Circulo() {
		
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double unRadio) {
		this.radio = unRadio;
	}
	
	
	public double getDiametro() {
		return this.radio * 2;
		
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2.0);
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}

}
