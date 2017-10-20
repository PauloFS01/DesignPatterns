package chainofresponsibility;

public class CalculaDesconto {
	
	public double calculaOrcamento(Orcamento orcamento) {
		Desconto d1 = new DescontoMaisDecincoItens();
        Desconto d2 = new DescontoMaisDeQuinhentos();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();
        
        d1.proximoDesconto(d2);
        d2.proximoDesconto(d3);
        d3.proximoDesconto(d4);
        
        return d1.calculaDesconto(orcamento);
	}

}
