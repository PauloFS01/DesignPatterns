package builder;

public class ItemNota {
	
	private String descricao;
	private double valor;
	
	public ItemNota(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}
	
	
}
