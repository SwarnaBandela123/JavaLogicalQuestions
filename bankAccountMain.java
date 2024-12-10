package inheritance;

public class bankAccountMain {

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(1000.0, 5.0);
        savings.displayBalance();
        savings.deposit(500);
        savings.applyInterest();
        
        CheckingAccount checking = new CheckingAccount(500.0);
        checking.displayBalance();
        checking.withdraw(200);
        savings.displayBalance(); 
        checking.displayBalance(); 

	}

}
