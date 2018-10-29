import java.util.Vector;
import java.text.DecimalFormat;


public class Account {

	protected double balance;
	protected Vector<String> transList = new Vector<String>();
	
	public Account(){
		
		balance = 0;
		
	}
	
	public void deposit(double money){
		
		balance += money;
		
		DecimalFormat df=new DecimalFormat("0.00");
		String rounded = df.format(money);
		System.out.println("Deposited " + rounded + " into the account.");
		this.viewBalance();
		transList.add("+" + rounded);
		
	}
	
	public void viewBalance(){
		
		DecimalFormat df=new DecimalFormat("0.00");
		String rounded = df.format(balance);
		System.out.println("Your balance is  $" + rounded);
		System.out.println();
		
	}
	
	public void viewTrans(){
		
		if (transList.size() == 0){
		
			System.out.println("No transactions have been made so far.");
			System.out.println();
			
		} else {
			
			for(int i=0;i<transList.size();i++){
			
				System.out.println(transList.elementAt(i));
			
			}
		
			System.out.println();
		}
	}
	
	public double getBalance(){
		
		return balance;
		
	}
	
	public Vector<String> getTranslist(){
		
		return transList;
		
	}
	
}
