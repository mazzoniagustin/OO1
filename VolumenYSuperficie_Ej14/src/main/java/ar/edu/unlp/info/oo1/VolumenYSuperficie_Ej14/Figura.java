package ar.edu.unlp.info.oo1.VolumenYSuperficie_Ej14;

public abstract class Figura {
	private String material;
	private String color;
	
	public Figura (String unColor, String unMaterial) {
		this.material = unMaterial;
		this.color = unColor;
	}

	public String getMaterial() {
		return material;
	}


	public String getColor() {
		return color;
	}
	
	public abstract double volumen();
	public abstract double superficie();

	
	

}
