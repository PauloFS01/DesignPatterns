package strategy;

public class TesteCalculaImposto {
	public static void main (String[] args) {
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		Orcamento orcamento = new Orcamento(1000);
		ICCC imposto = new ICCC();
		
		calculadorDeImpostos.realizaOrcamento(orcamento, imposto);
//		System.out.println(imposto.getValor(orcamento));
	}

}
