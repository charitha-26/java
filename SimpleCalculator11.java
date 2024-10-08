//11.	Write a Java program that works as a simple calculator. Use a switch statement to accept 2 numbers and an operator for the +, -,*, % operations. Perform arithmetic operation display the result. Handle any possible exceptions like divided by zero for division operation

import java.util.*;
public class SimpleCalculator11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator :");
		char op = sc.next().charAt(0);
		System.out.println("Enter 2 numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		switch(op) {
			case '+':
				System.out.println("Addition of 2 numbers : "+ (num1 + num2));
				break;
			case '-':
				int sub = num1 > num2 ? num1 - num2 : num2 - num1;
				System.out.println("Subtraction of 2 numbers :" + sub);
				break;	
			case '*':
				System.out.println("Multiplication of 2 numbers :" + (num1*num2));
				break;	
			case '/':	
				if(num2 == 0) { 
					System.out.println("Division is not possible!");
				}
				else {
					System.out.println("Division of 2 numbers : " + (num1/num2));
				}
				break;	
			case '%':
				if(num2 == 0) { 
					System.out.println("Division is not possible!");
				}
				else {
					System.out.println("Remainder of 2 numbers : " +(num1 % num2));
				}
				break;			
		}
		sc.close();
	}
}
