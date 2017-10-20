package visitor;

import interpreter.Numero;
import interpreter.Soma;
import interpreter.Subtracao;

public class ImpressoraVisitor implements Visitor{
	
    public void visitaSoma(Soma soma) {
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        System.out.print(" + ");
        soma.getDireita().aceita(this);
        System.out.print(")");

    }

    public void visitaSubtracao(Subtracao subtracao) {
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        System.out.print(" - ");
        subtracao.getDireita().aceita(this);
        System.out.print(")");
    }
    
    public void visitaNumero(Numero numero) {
        System.out.print(numero.getNum());

    }

}
