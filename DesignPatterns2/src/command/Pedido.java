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
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public void paga() {
		this.status = Status.PAGO;
	}
	
	public void finaliza() {
		this.status = Status.ENTREGUE;
		
	}

}
