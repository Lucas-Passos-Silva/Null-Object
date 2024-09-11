package nullObject.semRegra;

public class Main {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Lucas", 5000, new Fatura("ABC123", 150, false));
		user1.capturarSaldo();
		user1.acessarDadosFatura();
		user1.pagarFatura();
		user1.capturarSaldo();
		user1.acessarDadosFatura();
		user1.pagarFatura();

		
		System.out.println("-------------------------------------------");
		
		Usuario user2 = new Usuario("João", 100, new Fatura("CBA321", 500, false));
		user2.pagarFatura();
		user2.depositar(-100);
		user2.depositar(500);
		user2.pagarFatura();
		
		System.out.println("-------------------------------------------");
		Usuario user3 = new Usuario("Maria", 500, null);
		user3.pagarFatura();
		user3.acessarDadosFatura();
		
	}

}
