package nullObject.comRegra;

public class Usuario {
	private String nome;
	private double saldo;
	private Fatura fatura;
	
	public Usuario(String nome, double saldo, Fatura fatura) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		//Verifica apenas essa vez se existe fatura associada
		this.fatura = (fatura != null) ? fatura : new NullFatura();
	}
	
	public void acessarDadosFatura() {
		//Posso chamar o método sem verificar se há faturas associadas, uma vez que não tiver faturas, a classe será a `NullFatura`
		fatura.dadosFatura();
	}
	
	public void pagarFatura() {
		//Posso chamar o método sem verificar se há faturas associadas, uma vez que não tiver faturas, a classe será a `NullFatura`
			double valorFatura = fatura.valorFatura();
			if(saldo >= valorFatura && !fatura.situacaoPagamento() && valorFatura > 0.0) {
				saldo -= valorFatura;
				fatura.pagar();
				System.out.println("Usuário " + nome + " pagou uma fatura, saldo da conta: R$" + saldo);
			} else if (fatura.situacaoPagamento()) {
				System.out.println("Essa fatura já está paga");
			} else if (saldo < valorFatura){
				System.out.println("Você não tem saldo suficiente para pagar esta fatura. Saldo R$" + saldo);
			} else {
				System.out.println("Não é possível realizar essa ação pois não há faturas.");
			}
	}
	
	public void capturarSaldo() {
		System.out.println("Saldo R$" + saldo);
	}
	
	public void depositar(double valor) {
		//Lógica simples de depositar valor na conta
		if(valor <=0) {
			System.out.println("Não é possível depositar essa quantia");
		} else {
			saldo += valor;
			System.out.println("Valor depositado com sucesso. Saldo R$" + saldo);
		}
	}
}
