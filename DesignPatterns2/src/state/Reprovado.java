package state;

public class Reprovado implements EstadoOrcamento{

	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já foi repravodo anteriormente");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
