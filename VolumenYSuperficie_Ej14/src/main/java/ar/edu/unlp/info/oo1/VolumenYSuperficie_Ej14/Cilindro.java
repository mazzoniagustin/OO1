package ar.edu.unlp.info.oo1.VolumenYSuperficie_Ej14;

public class Cilindro extends Figura{
	private double radio;
	private double altura;
	
	public Cilindro(double radio , double altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double volumen() {
		return Math.PI * Math.pow(radio, 2) * this.altura;
	}
	
	public double getSuperficie() {
		double sum = 0;
		sum = 2 * Math.PI * this.radio * this.altura;
		sum += 2 * Math.PI * Math.pow(radio, 2);
		return sum;
	}
	
}
