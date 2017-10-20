package state;

public class EstadoNegativo implements EstadoConta {

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
		throw new RuntimeException("Essa conta não possiu saldo");

	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo = valor -= valor * 0.05;
		mudaEstado(conta);

	}

}
