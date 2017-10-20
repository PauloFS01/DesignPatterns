package visitor;

import interpreter.Numero;
import interpreter.Soma;
import interpreter.Subtracao;

public interface Visitor {
	
	public void visitaSoma(Soma soma);
	public void visitaSubtracao(Subtracao subtracao);
	public void visitaNumero(Numero numero);

}
