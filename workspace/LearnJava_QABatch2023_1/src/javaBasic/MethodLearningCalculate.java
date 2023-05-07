package javaBasic;
//Create 4 different methods to add, subtract, multiply, divide 
//using two global variables and print out the values from each method

public class MethodLearningCalculate {
	
	
		
	
		
		
		//when we declare variable outside of the method but inside the class it's call global variable
		//when we declare variable inside the method it's call local variable
	
	//datatype varibleName = values ---> variables
	static int firstNumber = 25;  //global variable
	static int secondNumber = 10; //global
	
	
	
	//declare a method : return type method/signature name (){}
	static void add(){
		
		System.out.println(" I am adding two variables here: ");
		System.out.println(firstNumber + secondNumber);
		
	}
	
	
	static void subtract(){
		
		System.out.println(" I am subtracting two variables here: ");
		System.out.println(firstNumber - secondNumber);
	}
	
	
	static void multiply(){
		
		System.out.println(" I am multiplying two variables here: ");
		System.out.println(firstNumber * secondNumber);
		
	}
	
	
	
	static void divide(){
		
		System.out.println(" I am dividing two variables here: ");
		System.out.println(firstNumber / secondNumber);
		
	}
	
	public static void main(String [] args){
		//calling the methods in the main method
		add();
		subtract();
		multiply();
		divide();
		
		
	}
	
	
	

}
