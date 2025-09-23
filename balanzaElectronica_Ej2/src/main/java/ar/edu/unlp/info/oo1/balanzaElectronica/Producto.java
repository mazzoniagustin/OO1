package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Producto {
	private double peso;
	private double precioPorKG;
	private String desc;
	
	
	
	public double getPrecio() {
		return precioPorKG * peso;
	}
	
	public double getPeso() {
		return this.peso;
	}

	public double getPrecioPorKG() {
		return precioPorKG;
	}

	public void setPrecioPorKG(double precioPorKG) {
		this.precioPorKG = precioPorKG;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
