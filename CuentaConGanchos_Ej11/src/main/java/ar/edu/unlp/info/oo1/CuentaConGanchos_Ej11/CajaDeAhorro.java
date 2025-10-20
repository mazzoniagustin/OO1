package ar.edu.unlp.info.oo1.CuentaConGanchos_Ej11;

public class CajaDeAhorro extends Cuenta{
	
	
	public CajaDeAhorro() {
		super();
	}
	
	public void depositar(double monto) {
		super.depositar(monto - monto * 0.02);
	}
	
	public void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto - monto * 0.02);
	}
	
	public boolean puedeExtraer(double monto) {
		if (this.getSaldo() >= monto + monto * 0.02) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
