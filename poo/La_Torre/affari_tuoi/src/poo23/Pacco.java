package poo23;

public class Pacco {
	private int numero;
	private int valore;
	
	public Pacco(int numero, int valore) {
		this.numero=numero;
		this.valore=valore;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int valore) {
		this.valore = valore;
	}

	@Override
	public String toString() {
		return "Pacco [numero=" + numero + ", valore=" + valore + "]";
	}
	
	
}