package state;

public class Conta {
	protected double saldo;
	protected EstadoConta estado;
	
	public Conta(double valor) {
		this.estado = new EstadoPositivo();
		deposita(valor);
	}
	public double getSaldo() {
		return this.saldo;
	}
	
    public void saca(double valor) {
        estado.saca(this, valor);
    }

    public void deposita(double valor) {
        estado.deposita(this, valor);
    }

}
