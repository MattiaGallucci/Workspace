package poo23.bank;

public class AccountTest {
	public static void main(String[] args) {
		BankAccount momsSavings = new SavingsAccount(0.5);
		BankAccount harrysChecking = new CheckingAccount(100);

		momsSavings.deposit(10000);
		momsSavings.transfer(2000, harrysChecking);
		harrysChecking.withdraw(1500);
		harrysChecking.withdraw(80);

		momsSavings.transfer(1000, harrysChecking);
		harrysChecking.withdraw(400);

		// simulazione della fine del mese
		((SavingsAccount) momsSavings).addInterest();
		((CheckingAccount) harrysChecking).deductFees();

		System.out.println("Mom's savings balance = $" + momsSavings.getBalance());
		System.out.println("Harry's checking balance = $" + harrysChecking.getBalance());
		System.out.println();
		
		
		DataSet<Measurable> ds = new DataSet<>();
		ds.add(new BankAccount(0));
		ds.add(new BankAccount(10000));
		ds.add(new BankAccount(2000));
		System.out.println("Saldo medio = " + ds.getAverage());
		Measurable max = ds.getMaximum();
		System.out.println("Saldo piu` alto = " + max.getMeasure());
		
	}
}