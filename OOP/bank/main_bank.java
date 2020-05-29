package bank;

public class main_bank {

	public static void main(String[] args) {
		Account account1 = new Account();
		
		account1.setLimiet(500);
		account1.getLimiet();
		System.out.println(account1.getSaldo());
		
		account1.stort(500);
		System.out.println(account1.getSaldo());
		
		account1.haalAf(200);
		System.out.println(account1.getSaldo());
		
		account1.haalAf(600);
		System.out.println(account1.getSaldo());
		
		account1.haalAf(400);
		System.out.println(account1.getSaldo());
		
		account1.stort(10000);
		System.out.println(account1.getSaldo());
		
		account1.haalAf(300);
		System.out.println(account1.getSaldo());
		
		account1.printVerrichtingen();
	}

}
