package builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ItemNota {
	
	private String descricao;
	private double valor;
	

	
	public ItemNota(String descricao, double valor) {
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
