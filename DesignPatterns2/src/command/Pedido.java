package command;

import java.util.Calendar;

public class Pedido {
	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataFinalizacao;
	public String getCliente() {
		return cliente;
	}
	public double getValor() {
		return valor;
	}
	public Status getStatus() {
		return status;
	}
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	public Pedido setCliente(String cliente) {
		this.cliente = cliente;
		return this;
	}
	public Pedido setValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	
	public void paga() {
		this.status = Status.PAGO;
		System.out.println(this.status);
	}
	
	public void finaliza() {
		this.status = Status.ENTREGUE;
		this.dataFinalizacao = Calendar.getInstance();
		System.out.println(this.status);
		
	}

}
