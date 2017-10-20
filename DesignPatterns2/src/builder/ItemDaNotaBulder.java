package builder;

public class ItemDaNotaBulder {
	private String descricao;
	private double valor;
	
	public ItemDaNotaBulder comDescricao(String descricao) {
		this.descricao = descricao;
		
		return this;
	}
	
	public ItemDaNotaBulder comValor(double valor) {
		this.valor = valor;
		
		return this;
	}
	
	public ItemNota constroi() {
		return new ItemNota(descricao, valor);
	}

}
