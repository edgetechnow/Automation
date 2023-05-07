package javaBasic;

public class LearnMethod {
	
/*	1.	Create a method called "calculateSum" that takes two integers as parameters and returns the sum of the two integers.

	2.	Call the "calculateSum" method from the "main" method and pass in two integers of your choice.

	3.	Print out the result returned by the "calculateSum" method.*/
	

	public static void main(String[] args) {
		
		
		
		calculateSum(6,60);
		
		calculateSum(5,20);
		
		calculateSum(7,70);
		
		calculateSum(1,10);
		
		calculateSum(9,90);
		
		
		
		
		
		
		

	}
	
	
	static int calculateSum(int a , int b){
		
		//body
		
		int sum = a + b;
		
		System.out.println(sum);//print 
		
		return sum;
		
		
	}
	

}
