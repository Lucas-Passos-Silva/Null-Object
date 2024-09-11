package nullObject.semRegra;

public class Usuario {
	private String nome;
	private double saldo;
	private Fatura fatura;
	
	public Usuario(String nome, double saldo, Fatura fatura) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.fatura = fatura;
	}
	
	public void acessarDadosFatura() {
		//Verifica pela primeira vez se há fatura associada
		if(fatura != null) {
			fatura.dadosFatura();
		} else {
			System.out.println("Não há fatura para ser mostrada.");
		}
	}
	
	public void pagarFatura() {
		//Necessário verificar novamente se há fatura associada e sempre que precisa manipular a fatura será necessário
		if(fatura != null) {
			double valorFatura = fatura.valorFatura();
			if(saldo >= valorFatura && !fatura.situacaoPagamento()) {
				saldo -= valorFatura;
				fatura.pagar();
				System.out.println("Usuário " + nome + " pagou uma fatura, saldo da conta: R$" + saldo);
			} else if (fatura.situacaoPagamento()) {
				System.out.println("Essa fatura já está paga");
			} else {
				System.out.println("Você não tem saldo suficiente para pagar esta fatura. Saldo R$" + saldo);
			}
		} else {
			System.out.println("Não há faturas para pagar");
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
