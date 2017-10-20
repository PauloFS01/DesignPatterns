package state;

public interface EstadoConta {
	
	public void mudaEstado(Conta conta);
	public void saca(Conta conta, double valor);
	public void deposita(Conta conta, double valor);
	

}
