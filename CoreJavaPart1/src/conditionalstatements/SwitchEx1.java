package conditionalstatements;

import java.util.Scanner;

public class SwitchEx1 {
	void arithmeticOperations(char op,int number1,int number2) {
		int result;
		switch (op) {

		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
		case '/':
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;
		default:

			System.out.println(" Invalid Operator ");
		}
	}

	public static void main(String[] args) {
		SwitchEx1 s=new SwitchEx1();
		char op;
		int number1, number2;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an operator: '+','-','*','/' :");
		op = input.next().charAt(0);
		System.out.println("Operator==>" + op);

		// ask users to enter numbers
		System.out.println("Enter first number");
		number1 = input.nextInt();

		System.out.println("Enter second number");
		number2 = input.nextInt();

		s.arithmeticOperations(op, number1, number2);
		input.close();
	}

}
