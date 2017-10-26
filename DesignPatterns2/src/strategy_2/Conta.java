package strategy_2;

import state.EstadoConta;

public class Conta {
	private double saldo;
	private EstadoConta estado;
	
	public EstadoConta getEstado() {
		return estado;
	}

	public void setEstado(EstadoConta estado) {
		this.estado = estado;
	}

	public Conta() {
		
	}

	public Conta(double valor) {
		this.saldo = valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void saca(double saldo) {
		this.saldo -= saldo;
		
	}

	public void deposita(double saldo) {
		this.saldo += saldo;
		
	}

}
