package strategy;

public class ICMS implements Imposto{
	public double getValor(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50;
	}

}
