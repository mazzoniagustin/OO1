package ar.edu.unlp.info.oo1.ClienteDeCorreo_Ej15;

public class Adjunto {
	private String nombre;
	
	public Adjunto(String unNombre) {
		this.nombre = unNombre;
	}
	
	public int tamanio() {
		return this.nombre.length();
	}

}
