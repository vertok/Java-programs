package mein.paket;

import java.util.Scanner;

public class Calc {
	
	
	public static void berechnen(double a, char symbol, double b){
	//	double ergebniss=0.0;
		switch(symbol) {
		case  '+': System.out.println(a+b); break;
		case  '-': System.out.println(a-b); break;
		case  '*': System.out.println(a*b); break;
		case  '/': System.out.println(a/b); break;
		case 'q': break;
		default: System.out.println("Ungueltige Eingabe"); break;  
		
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	
		

		
		
		
		System.out.println("Geben Sie die Operation ein: ");
		String input = scanner.nextLine();
		char ch = input.charAt(0);
		 input = scanner.nextLine();
		 System.out.println(ch);
		
		System.out.println("Geben Sie die erste Zahl ein: ");
		double a = (double)(input.charAt(0));
		System.out.println(a);
		System.out.println("Geben Sie die zweite Zahl ein: ");
		input = scanner.nextLine();
		double b = input.charAt(0);
		
		berechnen(a,ch,b);
		//String s = 
		scanner.close();
	}

}
