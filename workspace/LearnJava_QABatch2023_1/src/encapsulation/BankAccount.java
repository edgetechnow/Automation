package encapsulation;

/*Encapsulation is like a safe with a password that only you know. In our example, the BankAccount 
class has a safe with an account number and a balance inside. But other parts of the program can't 
open the safe directly - they have to ask nicely by using the getAccountNumber() and getBalance()
methods. And when you want to deposit or withdraw money, you have to use the deposit() and withdraw() 
methods to tell the safe what you want to do. The safe will only let you do it if you have enough money inside. 
And nobody else can see how much money you have, because it's still a secret in the safe.
*/


/*Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, 
polymorphism, and abstraction. Encapsulation in Java is a mechanism of wrapping the data (variables)
and code acting on the data (methods) together as a single unit. In encapsulation, the variables of 
a class will be hidden from other classes, and can be accessed only 
through the methods of their current class. Therefore, it is also known as data hiding.*/


public class BankAccount {
	private String accountNumber; // This is a private instance variable that
									// can only be accessed from within the
									// class
	private double balance; // This is a private instance variable that can only
							// be accessed from within the class

	public BankAccount(String accountNumber, double balance) { // This is a
																// constructor
																// for the
																// BankAccount
																// class

		this.accountNumber = accountNumber; // This sets the value of the
											// private accountNumber variable to
											// the value passed in as a
											// parameter

		this.balance = balance; // This sets the value of the private balance
								// variable to the value passed in as a
								// parameter
		
		
	}

	public String getAccountNumber() { // This is a public method that allows
										// other parts of the program to access
										// the private accountNumber variable
		return this.accountNumber;
	}

	public double getBalance() { // This is a public method that allows other
									// parts of the program to access the
									// private balance variable
		return this.balance;
	}

	public void deposit(double amount) { // This is a public method that allows
											// the user to deposit money into
											// the bank account
		
		this.balance += amount; // This adds the deposited amount to the current
								// balance
		//this.balance = this.balance + amount;
		
		System.out.println("You have deposited $" + amount + ". Your new balance is $" + this.balance + ".");
		// This prints a message to the console to confirm the deposit and show
		// the new balance
	}

	public void withdraw(double amount) { // This is a public method that allows
											// the user to withdraw money from
											// the bank account
		if (amount > this.balance) { // This checks if the requested withdrawal
										// amount is greater than the current
										// balance
			System.out.println("Insufficient funds.");
			// This prints a message to the console to indicate that the
			// withdrawal cannot be completed due to insufficient funds
		} else {
			this.balance -= amount; // This subtracts the requested withdrawal
									// amount from the current balance
			System.out.println("You have withdrawn $" + amount + ". Your new balance is $" + this.balance + ".");
			// This prints a message to the console to confirm the withdrawal
			// and show the new balance
		}
	}
}
