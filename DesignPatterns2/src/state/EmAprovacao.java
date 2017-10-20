package state;

public class EmAprovacao implements EstadoOrcamento {

	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		if(orcamento.descontoAplicado == 0) {
		orcamento.descontoAplicado = orcamento.valor *0.05;
		orcamento.valor -= orcamento.valor *0.05;
		}else {
			throw new RuntimeException("desconto só pode ser aplicado uma vez!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
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
