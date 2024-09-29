//12.	Write a Java program that perform integer divisions. The user enters two numbers, Num1 and Num2. The division of Num1 and Num 2 is displayed in the Result. If Num1 or Num2 were not an integer, the program would throw a Number Format Exception. If Num2 were Zero, the program would throw an Arithmetic Exception. 

import java.util.*;
public class ExceptionHandling12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 2 numbers : ");
            String input1 = sc.next();
            int num1 = Integer.parseInt(input1);
            
            String input2 = sc.next();
            int num2 = Integer.parseInt(input2);    
			float division = num1/num2;
			System.out.println("Division of 2 numbers is "+ division);
		}
		catch(NumberFormatException e){
			System.out.println("The given input is not an integer!");
		}
		catch(ArithmeticException e) {
			System.out.println("Number is not divisible by ZERO!");
		}
		sc.close();
	}
}
