package interpreter;

import visitor.Visitor;

public class Subtracao implements Expressao{
	Expressao direita;
	Expressao esquerda;
	
	public Subtracao(Expressao dir, Expressao esq) {
		this.direita = dir;
		this.esquerda = esq;
	}
	
	public double avalia() {
		return this.direita.avalia() - this.esquerda.avalia();
	}
	
	

	public Expressao getDireita() {
		return direita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSubtracao(this);
	}
	
}
