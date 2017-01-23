package session8;

public class Assignment8_1 {
	public static void main(String[] args) {
		BankAtm user1= new BankAtm(4516, "SBI", "Bangaloree", 15000);
		user1.withdrow(11000);
		user1.deposit(2000);
		user1.withdrow(11000);		
	}

}

class BankAtm{
	int atmId;
	String bankName;
	String location;
	double balance;
	
	
	public BankAtm(int atmId, String bankName, String location, double balance) {
		
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	
	
	public void withdrow(double amount)
	{
		
		try{
		if(amount>balance || balance<10000){
			throw new BankATMException("Check Your balance which is less than 10K or you are treing to wihtdrow more than balance!!!");
		}else{
		balance -=amount;
		System.out.println("Amount "+amount +" is withdrown from your A/C. \n Thank You for transaction.");
		}
		}
		catch(BankATMException m){
			System.out.println("Exception occured:");
			System.out.println(m);
			}
		
	}
	
	void deposit(double amount){
		balance+=amount;
		System.out.println("Amount "+amount +" is depositted to your A/C. \n Thank You for transaction.");
		
	}
}

class BankATMException extends Exception{
	

	public BankATMException(String string) {
		super(string);
	}
	
}