package templatemethod;

import strategy.Orcamento;

public class Teste {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(123.0);
		
		ICPP impostoICPP = new ICPP();
		IKCV impostoIKCV = new IKCV();
		
		System.out.println("impostoICPP: " + impostoICPP.getValor(orcamento));
		System.out.println("impostoIKCV: " + impostoIKCV.getValor(orcamento));
	}

}
