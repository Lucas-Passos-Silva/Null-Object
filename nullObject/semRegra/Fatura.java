package nullObject.semRegra;

public class Fatura {
	private String numeroFatura;
	private double debitoFatura;
	private boolean pago;
	
	public Fatura(String numeroFatura, double debitoFatura, boolean pago) {
		super();
		this.numeroFatura = numeroFatura;
		this.debitoFatura = debitoFatura;
		this.pago = pago;
	}
	
	protected void dadosFatura() {
		System.out.println("Número da fatura: " + numeroFatura);
		System.out.println("Valor: R$" + debitoFatura);
		System.out.println("Situação: " + (pago ? "Pago" : "Em aberto"));
	}
	
	protected double valorFatura() {
		//Método a ser acessado pelo usuário para pagar a fatura
		return debitoFatura;
	}
	
	protected boolean pagar() {
		//Método responsável por fazer o pagamento da fatura
		if(!pago) {
			pago = true;
			System.out.println("Fatura de número: " + numeroFatura + " com o valor de R$" + debitoFatura +" foi paga com sucesso!");
			return true;
		} else if(pago){
			System.out.println("Essa fatura já foi paga.");
		}
		
		return false;
	}
	
	protected boolean situacaoPagamento() {
		//Retorna se a fatura foi paga ou não mas em formato booleano
		return pago;
	}
	

}
