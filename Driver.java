import java.text.DecimalFormat;
import java.util.Scanner;

public class Driver {

	public static void runInterface(Customer cust){
		
		Scanner scan = new Scanner(System.in);
		int choice = -1;
		int choice2 = -1;
		int password;
		
		System.out.println("Hello " + cust.getFirstName() + "!");
		System.out.println("Please enter your pin:");
		password = scan.nextInt();
		
		while(password != cust.getPin()){
			
			System.out.println("Invalid, please try again");
			System.out.println("or press 0 to cancel.");
			password = scan.nextInt();
			
			if (password == 0){
				password = cust.getPin();
				choice = 0;
			}
			
		}
		
		while(choice != 0){
		
			System.out.println("Please choose the following options: ");
			System.out.println();
			System.out.println("0 to quit.");
			System.out.println("1 to select your checking account");
			System.out.println("2 to select your savings account");
			System.out.println();
			
			choice = scan.nextInt();
			
			if (choice == 1){
				
				choice2 = -1;
				
				while (choice2 !=5){
				
					System.out.println("Checking account: Please choose the following options ");
					System.out.println();
					System.out.println("1 to deposit money");
					System.out.println("2 to withdraw money");
					System.out.println("3 to view your balance");
					System.out.println("4 to view transaction history");
					System.out.println("5 to go back");
				
					choice2 = scan.nextInt();
				
					if (choice2 == 1){
					
						double moneyDeposited;
						System.out.println("How much money would you like to deposit?");
						moneyDeposited = scan.nextDouble();
						cust.depositInCheckings(moneyDeposited);
						
					} else if (choice2 == 2){
					
						double moneyDeposited;
						System.out.println("How much money would you like to withdraw?");
						moneyDeposited = scan.nextDouble();
						cust.withdrawFromCheckings(moneyDeposited);
						
					
					} else if (choice2 == 3){
						
						cust.getCheckings().viewBalance();
						
					} else if (choice2 == 4){
					
						cust.getCheckings().viewTrans();
											
					} else if (choice2 == 5){
					
						choice = -1;
								
					} else {
						
						System.out.println("Error. Select a valid choice.");
						System.out.println();
						
					}
				
				}
				
			} else if (choice == 2){
				
				choice2 = -1;
				
				while(choice2 != 5){
					
					System.out.println("Savings Account: Please choose the following options ");
					System.out.println();
					System.out.println("1 to deposit money");
					System.out.println("2 to transfer money to checkings");
					System.out.println("3 to view your balance");
					System.out.println("4 to view transaction history");
					System.out.println("5 to go back");
					
					choice2 = scan.nextInt();
					
					if (choice2 == 1){
						
						double moneyDeposited2;
						System.out.println("How much money would you like to deposit?");
						moneyDeposited2 = scan.nextDouble();
						cust.depositInSavings(moneyDeposited2);
						
						
					} else if (choice2 == 2) {
						
						double moneyDeposited2;
						System.out.println("How much money would you like to transfer from savings to checkings?");
						moneyDeposited2 = scan.nextDouble();
						cust.transferFromSavings(moneyDeposited2);
						
						
					} else if (choice2 == 3){
						
						cust.getSavings().viewBalance();
						
					} else if (choice2 == 4){
						
						cust.getSavings().viewTrans();
						
					} else if (choice2 == 5){
						
						choice = -1;
					
					} else {
						
						System.out.println("Error. Select a valid choice.");
						System.out.println();
						
					}
					
				}
				
			} else if (choice == 0){
				
				System.out.println("Thank you. Have a nice day.");
				
			} else {
				
				System.out.println("Error. Please select a valid choice.");
				System.out.println();
				
			}
			
		}
		
	}
	
	
	public static void main (String[]args){
		
		Customer firstCustomer = new Customer("Steve", "Jobs", 8900);
		runInterface(firstCustomer);
	}
	
	
}
