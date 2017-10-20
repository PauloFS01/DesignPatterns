package chainofresponsibility;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximo;
	
	@Override
	public double calculaDesconto(Orcamento orcamento) {
		if(existe("LAPIS",orcamento) && existe("CANETA",orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.calculaDesconto(orcamento);
	}

	@Override
	public void proximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		
	}
	
	 private boolean existe(String nomeDoItem, Orcamento orcamento) {
         for (Item item : orcamento.getItens()) {
             if(item.getNome().equals(nomeDoItem)) return true;
         }
         return false;
     }

}
