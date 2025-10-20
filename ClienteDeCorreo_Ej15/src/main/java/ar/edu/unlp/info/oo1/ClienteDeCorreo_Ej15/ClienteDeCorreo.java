package ar.edu.unlp.info.oo1.ClienteDeCorreo_Ej15;
import java.util.*;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	
	public ClienteDeCorreo() {	
		this.inbox = new Carpeta("Inbox");
		this.carpetas = new LinkedList<Carpeta>();
	}
	
	public void recibir(Email email) {
		if (email != null) {
			inbox.agregarMail(email);
		}
	}
	
	public void mover(Email mail, Carpeta destino) {
		
	}
	
	public int espacioOcupado() {
		int suma = carpetas.stream().mapToInt(carpetas -> carpetas.tamanio()).sum();
		return suma + inbox.tamanio();
	}
	
	public Email buscar (String texto) {
		return carpetas.stream().map(carpetas -> carpetas.buscar(texto)).findFirst().orElse(null);
	}
}