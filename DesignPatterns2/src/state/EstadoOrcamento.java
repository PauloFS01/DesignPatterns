package state;

public interface EstadoOrcamento {

	public void aplicaDesconto(Orcamento orcamento);
	
	public void aprova(Orcamento orcamento);
	public void reprova(Orcamento orcamento);
	public void finaliza(Orcamento orcamento);
}
