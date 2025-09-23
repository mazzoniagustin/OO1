package ar.edu.unlp.info.oo1.RedAlumbrado_Ej9;
import java.util.*;

public class Farola {
	private boolean on;
	private List<Farola> neightbours;
	
	public Farola () {
		this.on = false;
		this.neightbours = new LinkedList<Farolas>();
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
	
	public void pairWithNeightbour(Farola other) {
		if (!this.neightbours.contains(other)) {
			neightbours.add(other);
			other.pairWithNeightbour(this);
		}
	}
	
	public void turnOn() {
		if (this.isOff()) {
			this.on = true;
			for (Farola f: this.neightbours) {
				f.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if (this.isOn()) {
			this.on = false;
			for (Farola f: this.neightbours) {
				f.turnOff();
			}
		}
	}
}
