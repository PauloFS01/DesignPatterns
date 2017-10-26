package command;

import facade_singleton.Facade;

public class Teste {
	public static void main(String[] args) {
		
		Facade facade = new Facade();
		Pedido pedido = facade.retornaPedido();
		
		PagaPedido paga = new PagaPedido(pedido);
		
		FinalizaPedido finaliza = new FinalizaPedido(pedido);
		
		paga.executa();
		finaliza.executa();
	}
}
