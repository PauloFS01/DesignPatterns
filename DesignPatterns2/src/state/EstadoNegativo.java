package state;

import strategy_2.Conta;

public class EstadoNegativo implements EstadoConta {

	@Override
	public void mudaEstado(Conta conta) {
		if(conta.getSaldo() <= 0) {
			conta.setEstado(new EstadoNegativo());
		}else {
			conta.setEstado(new EstadoPositivo());
		}

	}

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Essa conta não possiu saldo");

	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(valor -= valor * 0.05);
		mudaEstado(conta);

	}

}
