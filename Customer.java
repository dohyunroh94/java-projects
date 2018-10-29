public class Customer {

	private Checking myCheckings;
	private Savings mySavings;
	private String firstName;
	private String lastName;
	private int pin;
	
	Customer(String first, String last, int pinNum){
		
		firstName = first;
		lastName = last;
		myCheckings = new Checking();
		mySavings = new Savings();
		pin = pinNum;
	
	}
	
	public String getFirstName(){
		
		return firstName;
		
	}
	
	public String getLastName(){
		
		return lastName;
		
	}
	
	public double getCheckingsBalance(){
		
		return myCheckings.getBalance();
		
	}
	
	public double getSavingsBalance(){
		
		return mySavings.getBalance();
		
	}
	
	public void depositInCheckings(double money){
		
		myCheckings.deposit(money);
	
	}
	
	public void depositInSavings(double money){
		
		mySavings.deposit(money);
	
	}
	
	public void withdrawFromCheckings(double money){
		
		myCheckings.withdraw(money);
		
	}
	
	public void transferFromSavings(double money){
		
		mySavings.transferToChecking(money, myCheckings);
		
	}
	
	public int getPin(){
		
		return pin;
		
	}
	
	public Account getCheckings(){
		
		return myCheckings;
		
	}
	
	public Account getSavings(){
		
		return mySavings;
		
	}
	
}
