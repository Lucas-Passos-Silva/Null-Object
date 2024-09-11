package nullObject.comRegra;

public class Main {

public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Lucas", 5000, new FaturaEnergia("ABC123", 150, false));
		user1.capturarSaldo();
		user1.acessarDadosFatura();
		user1.pagarFatura();
		user1.capturarSaldo();
		user1.acessarDadosFatura();
		user1.pagarFatura();

		
		System.out.println("-------------------------------------------");
		
		Usuario user2 = new Usuario("João", 100, new FaturaEnergia("CBA321", 500, false));
		user2.pagarFatura();
		user2.depositar(-100);
		user2.depositar(500);
		user2.pagarFatura();
		
		System.out.println("-------------------------------------------");
		Usuario user3 = new Usuario("Maria", 500, null);
		user3.pagarFatura();
		user3.acessarDadosFatura();
		
		System.out.println("-------------------------------------------");
		Usuario user4 = new Usuario("José", 1400, new FaturaAgua("AGUA1231", 150, 4.5, false));
		user4.acessarDadosFatura();
		user4.pagarFatura();
		user4.acessarDadosFatura();
		
	}

}
