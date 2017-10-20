package strategy;

public class ISS implements Imposto{
	
	public double getValor(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
