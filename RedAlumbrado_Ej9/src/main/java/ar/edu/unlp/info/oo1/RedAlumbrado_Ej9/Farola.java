package ar.edu.unlp.info.oo1.RedAlumbrado_Ej9;
import java.util.*;

public class Farola {
	private boolean on;
	private List<Farola> neightbors;
	
	public Farola () {
		this.on = false;
		this.neightbors = new LinkedList<Farola>();
	}
	
	public boolean isOn() {
		if (this.on == true) {
			return true;
		}
		else return false;
	}
	
	public boolean isOff() {
		return !this.isOn();
	}
	
	public void pairWithNeightbor(Farola other) {
		if (!this.neightbors.contains(other)) {
			neightbors.add(other);
			other.pairWithNeightbor(this);
		}
	}
	
	public void turnOn() {
		if (this.isOff()) {
			this.on = true;
			for (Farola f: this.neightbors) {
				f.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if (this.isOn()) {
			this.on = false;
			for (Farola f: this.neightbors) {
				f.turnOff();
			}
		}
	}

	public List<Farola> getNeightbors() {
		return neightbors;
	}

	
	
}
