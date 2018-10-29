import java.text.DecimalFormat;

public class Checking extends Account{

	public void withdraw(double money){
		
		if (balance < money){
			
			System.out.println("Not enough money in the account.");
			this.viewBalance();
			
		} else {
			DecimalFormat df=new DecimalFormat("0.00");
			String rounded = df.format(money);
			
			balance -= money;
			System.out.println("Withdrew $" + rounded + " from the account.");
			this.viewBalance();
			transList.add("-" + rounded);
			
			
		}
		
	}
	
}
