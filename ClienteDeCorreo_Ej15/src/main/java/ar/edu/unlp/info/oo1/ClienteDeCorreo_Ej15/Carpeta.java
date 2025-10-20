package ar.edu.unlp.info.oo1.ClienteDeCorreo_Ej15;
import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	
	public Carpeta(String unNombre) {
		this.nombre = unNombre;
	}
	
	public void agregarMail(Email mail) {
		if (mail != null) {
			emails.add(mail);
		}
	}
	
	public void mover(Email unMail , Carpeta destino) {
		if (this.emails.contains(unMail)) {
			emails.remove(unMail);
			destino.agregarMail(unMail);
		}
	}
	
	public Email buscar(String contenido) {
		return emails.stream().filter(emails -> emails.getTitulo().contains(contenido) || emails.getCuerpo().contains(contenido)).findFirst().orElse(null);
	}
	
	public int tamanio() {
		int suma = emails.stream().mapToInt(emails -> emails.tamanio()).sum();
		return suma + this.nombre.length();
	}
	
}
