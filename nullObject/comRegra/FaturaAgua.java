package nullObject.comRegra;

public class FaturaAgua implements Fatura{
	//A escalabilidade permite que eu crie faturas com campos diferentes com liberdade
	private String numeroFatura;
	private double debitoFatura;
	private double multa;
	private double totalDebitoFatura;
	private boolean pago;

	
	public FaturaAgua(String numeroFatura, double debitoFatura, double multa, boolean pago) {
		super();
		this.numeroFatura = numeroFatura;
		this.debitoFatura = debitoFatura;
		this.multa = multa;
		this.pago = pago;
		this.totalDebitoFatura = this.multa + this.debitoFatura;
	}

	@Override
	public void dadosFatura() {
		System.out.println("---------------------------------");
		System.out.println("Fatura de número: " + numeroFatura);
		System.out.println("Valor: R$" + debitoFatura);
		System.out.println("Multa: R$" + multa);
		System.out.println("---------------------------------");
		System.out.println("Total; R$" + totalDebitoFatura);
		System.out.println("Situação: " + (pago ? "Pago" : "Em aberto"));
		System.out.println("---------------------------------");
		
	}

	@Override
	public double valorFatura() {
		return totalDebitoFatura;
	}

	@Override
	public boolean pagar() {
		//Método responsável por fazer o pagamento da fatura
		if(!pago) {
			pago = true;
			System.out.println("Fatura de número: " + numeroFatura + " com o valor de R$" + totalDebitoFatura +" foi paga com sucesso!");
			return true;
		} else if(pago){
			System.out.println("Essa fatura já foi paga.");
		}
		
		return false;
	}

	@Override
	public boolean situacaoPagamento() {
		return pago;
	}

}
