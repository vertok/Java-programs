package mein.paket;
import java.util.Scanner;


public class Zeichenketten {
	public static void main(String[] args) {
		System.out.println(
				"Das Rechteck hat eine Breite von " + 9 + ", eine Lange von " + 12 + " und eine Fläsche von ...");
		System.out.println(8 + " dividiert durch " + 10 + " ergibt " + (8 / 10));
		System.out.println(3 + " + 2*2" + " ergibt " + (3+2*2));
		//System.out.println("Ergebnis: " + 4 + 4/5 + (-(3 + 4/5*5))); 
		System.out.println("Bitte Text eingeben: ");
		Scanner scanner = new Scanner (System.in);
		String eingabe = scanner.nextLine();
		System.out.println("Ausgabe " + eingabe);
		int i = Integer.parseInt(eingabe);
		System.out.println("Zahl: " + i*2);
		
		eingabe  = scanner.nextLine();
		int j = Integer.parseInt(eingabe);
		System.out.println("Summe: " + (i+j));
		scanner.close();
	}
}
