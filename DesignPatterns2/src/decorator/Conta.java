package decorator;

public class Conta {
	private double saldo;

	public Conta(double valor) {
		this.saldo = valor;
	}
	public Conta() {

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

}
