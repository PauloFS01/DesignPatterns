package chainofresponsibility;

import facade_singleton.Facade;

public class Teste {
	public static void main(String[] args) {
		Facade facade = new Facade();
		
		Orcamento orcamento = facade.retornaOrcamento();

		CalculaDesconto calculaDesconto = facade.retornaCalculaDesconto();

		System.out.println(calculaDesconto.calculaOrcamento(orcamento));
		
		
	}
}
/*

 		Orcamento orcamento = new Orcamento(500);
		Orcamento orcamento2 = new Orcamento(501);
		CalculaDesconto calculaDesconto = new CalculaDesconto();
		
		orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));
        
        orcamento2.adicionaItem(new Item("BORRACHA", 250.0));
        
		
		System.out.println(calculaDesconto.calculaOrcamento(orcamento));
		System.out.println(calculaDesconto.calculaOrcamento(orcamento2));
 */