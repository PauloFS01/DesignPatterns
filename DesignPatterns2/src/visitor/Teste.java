package visitor;

import interpreter.Expressao;
import interpreter.Numero;
import interpreter.Soma;
import interpreter.Subtracao;

public class Teste {
	
public static void main(String[] args) {
	ImpressoraVisitor visitor = new ImpressoraVisitor();
	VisitorPrefixo prefixo = new VisitorPrefixo();
	
	Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
	Expressao direita = new Soma(new Numero(2), new Numero(10));

	Expressao conta = new Soma(esquerda, direita);
	
	//conta.aceita(visitor);
	conta.aceita(prefixo);
}
	
	

}
