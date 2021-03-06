package interpreter;

import visitor.ImpressoraVisitor;
import visitor.Visitor;

public class Divisao implements Expressao{

	Expressao direita;
	Expressao esquerda;
	
	public Divisao(Expressao dir, Expressao esq) {
		this.direita = dir;
		this.esquerda = esq;
	}

	@Override
	public double avalia() {
		return this.direita.avalia() / this.esquerda.avalia();
	}


	@Override
	public void aceita(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
