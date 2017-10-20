package state;

public class EstadoPositivo implements EstadoConta {

	@Override
	public void mudaEstado(Conta conta) {
		if(conta.saldo <= 0) {
			conta.estado = new EstadoNegativo();
		}else {
			conta.estado =  new EstadoPositivo();
		}
		
	}

	@Override
	public void saca(Conta conta, double valor) {
		conta.saldo = conta.saldo - valor;
		mudaEstado(conta);
		
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo = valor -= valor * 0.02;
		mudaEstado(conta);
		
	}

}
