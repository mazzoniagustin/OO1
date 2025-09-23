package ar.edu.unlp.info.oo1.GenealogiaSalvaje_Ej8;
import java.util.Date;

public class Mamifero {
	private String identificador,especie;
	private Date fechaNacimiento;
	private Mamifero madre,padre;
	
	public Mamifero() {
		
	}
	
	
	public Mamifero (String unIdentif) {
		this.identificador = unIdentif;
	}
	
	public void setIdentificador(String unIdentificador) {
		this.identificador = unIdentificador;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setEspecie(String unaEspecie) {
		this.especie = unaEspecie;
	}
	
	public String getEspecie() {
		return this.especie;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getMadre() {
		if (madre != null) {
			return madre;
		}
		else {
			return null;
		}
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getPadre() {
		if (padre != null) {
			return padre;
		}
		else {
			return null;
		}
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (madre != null) {
			return madre.getMadre();
		}
		else {
			return null;
		}
	}
	public Mamifero getAbueloMaterno() {
		if (madre != null) {
			return madre.getPadre();
		}
		else {
			return null;
		}
	}
	
	public Mamifero getAbuelaPaterna() {
		if (padre != null) {
			return padre.getMadre();
		}
		else {
			return null;
		}
	}
	public Mamifero getAbueloPaterno() {
		if (padre != null) {
			return padre.getPadre();
		}
		else {
			return null;
		}
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamif) {
	    if (unMamif == null || unMamif == this) {
	        return false;
	    }

	    if (this.madre != null) {
	        if (this.madre.equals(unMamif) || this.madre.tieneComoAncestroA(unMamif)) {
	            return true;
	        }
	    }

	    if (this.padre != null) {
	        if (this.padre.equals(unMamif) || this.padre.tieneComoAncestroA(unMamif)) {
	            return true;
	        }
	    }

	    return false;
	}

	
	
	
	
	

}
