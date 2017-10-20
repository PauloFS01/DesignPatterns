package strategy;

public class CalculadorDeImpostos {
	
	public void realizaOrcamento(Orcamento orcamento, Imposto imposto) {
		System.out.println("O valor do Imposto �: " + imposto.getValor(orcamento));
	}

}
