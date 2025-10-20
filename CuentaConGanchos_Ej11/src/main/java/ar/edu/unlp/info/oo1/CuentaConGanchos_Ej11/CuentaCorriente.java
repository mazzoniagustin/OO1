package ar.edu.unlp.info.oo1.CuentaConGanchos_Ej11;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		super();
		descubierto = 0;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	public boolean puedeExtraer(double monto) {
		if (this.getSaldo() + this.descubierto >= monto) {
			return true;
		}
		else {
			return false;
		}
	}


}
