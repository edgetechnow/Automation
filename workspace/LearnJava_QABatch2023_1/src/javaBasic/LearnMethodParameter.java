package javaBasic;

public class LearnMethodParameter {

	/*
	 * create employeeName as method and pass String name and return the name ,
	 * 2nd method as employeeAge and pass age as int and retun the age, third
	 * method name as employeeID create another method for random employee id
	 * takes id as int parameter , 4th name method as employee pass 3 parameter
	 * name as String, age as int, employee id as int,
	 */

	public static void main(String[] args) {

		person("Hasan", 28, 1);

		person("Syeda", 20, 2);

		person("Humaira", 21, 3);

		person("Roji", 19, 4);

		person("Brishti", 18, 5);

		person("Salim", 38, 6);

		//String myname = "Adam";
		//int myid = 12;

		//person(myname, 42, myid);

		employee();

	}

	static void employee() {

		String empName = "Sammy";
		int empAge = 29;
		int empID = 23;

		System.out.println("My name is  : " + empName + " My age is : " + empAge + " my id is: " + empID);

	}

	// create method name as person , pass my name as String, age as int.

	public static void person(String name, int age, int id) {// parameterization

		System.out.println("My name is : " + name + "\n And my age is : " + age + " my id :" + id);

	}

}
