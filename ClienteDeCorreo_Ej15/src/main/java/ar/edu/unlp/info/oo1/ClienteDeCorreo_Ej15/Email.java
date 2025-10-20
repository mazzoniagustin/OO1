package ar.edu.unlp.info.oo1.ClienteDeCorreo_Ej15;
import java.util.*;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Adjunto> adjuntos;
	
	private Email (String unTitulo, String unCuerpo) {
		this.titulo = unTitulo;
		this.cuerpo = unCuerpo;
		this.adjuntos = new LinkedList<Adjunto>();
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}

	public List<Adjunto> getAdjuntos() {
		return adjuntos;
	}
	
	public void agregarAdjunto(Adjunto unAdj) {
		if (unAdj != null) {
			adjuntos.add(unAdj);
		}
	}
	
	public int tamanio() {
		int suma = adjuntos.stream().mapToInt(adjuntos -> adjuntos.tamanio()).sum();
		return this.titulo.length() + this.cuerpo.length() + suma;
	}
	
	

}
