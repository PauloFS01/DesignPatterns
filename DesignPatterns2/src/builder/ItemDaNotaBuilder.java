package builder;



public class ItemDaNotaBuilder {
	String descricao;
	double valor;
	
	
	public ItemNota constroi(String descricao, double valor) {
		return new ItemNota(descricao, valor);
	}

}
