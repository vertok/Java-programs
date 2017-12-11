package mein.paket;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double result;

		System.out.print(
				"Enter an operator (+, -, *, /, p(^), x(Max), n(Min), a(ABS(a)), r(round(a)), w(sqrt(a)), l(Log10(a)): ");
		char operator = scanner.next().charAt(0);
	

		/* for this operator you need to enter two numbers */
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == 'p'
				|| operator == 'x' || operator == 'n') {
			
			System.out.print("Enter first number: ");
			double first = Double.parseDouble(scanner.next());
			System.out.print("Enter second number: ");
			double second = Double.parseDouble(scanner.next());

			switch (operator) {
			case '+':
				result = first + second;
				System.out.println(first + " " + operator + " " + second + " = " + result);
				break;

			case '-':
				result = first - second;
				System.out.println(first + " " + operator + " " + second + " = " + result);
				break;

			case '*':
				result = first * second;
				System.out.println(first + " " + operator + " " + second + " = " + result);
				break;

			case '/':
				result = first / second;
				System.out.println(first + " " + operator + " " + second + " = " + result);
				break;

			case 'p':
				result = Math.pow(first, second);
				System.out.println(first + " ^ " + second + " = " + result);
				break;

			case 'x':
				result = Math.max(first, second);
				System.out.println("Max(" + first + ", " + second + ") = " + result);
				break;

			case 'n':
				result = Math.min(first, second);
				System.out.println("Min(" + first + ", " + second + ") = " + result);
				break;
				
			case 'q':
				System.out.printf("Auf Wiedersehen!");
				break;

			default:
				System.out.printf("Error! operator is not correct");

			}
		}

		/* for this operator you need to enter only one number */
		else {
			
			System.out.print("Enter a number: ");
			double number = Double.parseDouble(scanner.next());

			switch (operator) {

			case 'a':
				result = Math.abs(number);
				System.out.println("ABS(" + number + ") = " + result);
				break;

			case 'r':
				result = Math.round(number);
				System.out.println("round(" + number + ") = " + result);
				break;

			case 'w':
				result = Math.sqrt(number);
				System.out.println("sqrt(" + number + ") = " + result);
				break;

			case 'l':
				result = Math.log10(number);
				System.out.println("Log10(" + number + ") = " + result);
				break;
				
			case 'q':
				System.out.printf("Auf Wiedersehen!");
				break;

			default:
				System.out.printf("Error! operator is not correct");
			}
			
		}
		scanner.close();

	}
}
