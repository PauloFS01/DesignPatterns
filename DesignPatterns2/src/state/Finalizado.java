package state;

public class Finalizado implements EstadoOrcamento{
	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o mudam de estado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o mudam de estado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o mudam de estado");
		
	}

}