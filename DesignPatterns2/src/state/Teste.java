package state;

public class Teste {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(300);
		System.out.println(orcamento.valor);
		
		orcamento.darDesconto();
		System.out.println(orcamento.valor +"\n");
		
		Orcamento orcamento2 = new Orcamento(400);
		System.out.println(orcamento2.valor);
		orcamento2.aprova();
		orcamento2.darDesconto();
		System.out.println(orcamento2.valor);
		
		//orcamento.darDesconto(); //lança uma exception
	}

}
