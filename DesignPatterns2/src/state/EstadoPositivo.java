package state;

import strategy_2.Conta;

public class EstadoPositivo implements EstadoConta {

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
		conta.setSaldo(conta.getSaldo() - valor);
		mudaEstado(conta);
		
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo( valor -= valor * 0.02);
		mudaEstado(conta);
		
	}

}
