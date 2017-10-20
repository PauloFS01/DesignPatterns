package command;

public class FinalizaPedido implements Comando{
	private Pedido pedido;
	
	public FinalizaPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		pedido.finaliza();
		
	}




}
