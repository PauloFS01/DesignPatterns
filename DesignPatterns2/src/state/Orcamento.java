package state;

public class Orcamento {
	protected double valor;
	protected double descontoAplicado;
	protected EstadoOrcamento estadoAtual; 
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.descontoAplicado = 0;
		this.estadoAtual = new EmAprovacao();
	}
	
	public void darDesconto() {
		estadoAtual.aplicaDesconto(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}
}
