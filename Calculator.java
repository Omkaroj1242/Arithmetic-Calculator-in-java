package arithmeticCalculator;

import java.util.Scanner;

public class Calculator {
//	ADDITION FUNCTION
	public double add(double a, double b) {
		return a+b;
	}
//	SUBSTRACTION FUNCTION
	public double subtract(double a, double b) {
		return a-b;
	}
//	MULTIPLICATION FUNCTION
	public double multiply(double a, double b) {
		return a*b;
	}
//	DIVISION FUNCTION
	public double divide(double a, double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
//		CREATING AN OBJECT
		Calculator cal = new Calculator();
//		CREATING A SCANNER OBJECT
		Scanner sc = new Scanner(System.in);
		
		while(true) {
//		ASKING USER FOR INPUTS AND TAKING INPUTS
		System.out.println("Please enter first number");
		double num1 = sc.nextDouble();
		System.out.println("Please enter second number");
		double num2 = sc.nextDouble();
		System.out.println("Please enter the operator for operation to perform(+,-,*,/)");
		char op = sc.next().charAt(0);
		
//		PERFORMING OPERATIONS BASED ON THE OPERATOR PROVIDED BY USER
		if(op == '+') System.out.println(cal.add(num1, num2));
		else if(op == '-') System.out.println(cal.subtract(num1, num2));
		else if(op == '*') System.out.println(cal.multiply(num1, num2));
		else if(op == '/') System.out.println(cal.divide(num1, num2));
		
		System.out.println("Do you want to perform some more operations? (y/n)");
		char ch = sc.next().charAt(0);
		
		if(ch == 'n' || ch == 'N') break;
		}
		
	}
}
