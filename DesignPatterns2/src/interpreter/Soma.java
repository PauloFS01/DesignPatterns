package interpreter;

import visitor.ImpressoraVisitor;
import visitor.Visitor;

public class Soma implements Expressao{
	Expressao direita;
	Expressao esquerda;
	
	public Soma(Expressao dir, Expressao esq) {
		this.direita = dir;
		this.esquerda = esq;
	}
	
	public double avalia() {
		return this.direita.avalia() + this.esquerda.avalia();
	}

	
	
	public Expressao getDireita() {
		return direita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSoma(this);
		
	}
	
}
