import java.text.DecimalFormat;

public class Savings extends Account{

	public void transferToChecking(double money, Checking otherAccount){
		
		if (balance < money){
			
			System.out.println("Not enough money in the account.");
			this.viewBalance();
			
			
		} else {
			
			DecimalFormat df=new DecimalFormat("0.00");
			String rounded = df.format(money);
			
			balance -= money;
			otherAccount.deposit(money);
			System.out.println("Tranferred $" + rounded +" from savings to checkings.");
			transList.add("-" + rounded);
			this.viewBalance();
				
		}
		
		
		
	}
	
}
