package state;

public class Finalizado implements EstadoOrcamento{
	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não mudam de estado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não mudam de estado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não mudam de estado");
		
	}

}