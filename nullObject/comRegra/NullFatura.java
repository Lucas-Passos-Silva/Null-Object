package nullObject.comRegra;

public class NullFatura implements Fatura {
	//Em cada método eu poderia gerar um log diferente ou comunicar algum canal o trigger para lidar com a situação
	
	@Override
	public void dadosFatura() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double valorFatura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean pagar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean situacaoPagamento() {
		// TODO Auto-generated method stub
		return false;
	}

}
