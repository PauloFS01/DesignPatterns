package state;

public class Aprovado implements EstadoOrcamento{

	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		if(orcamento.descontoAplicado == 0) {
			orcamento.descontoAplicado = orcamento.valor *0.02;
			orcamento.valor -= orcamento.valor *0.02;
		}else {
			throw new RuntimeException("desconto só pode ser aplicado uma vez!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já foi aprovado anteriormente!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
