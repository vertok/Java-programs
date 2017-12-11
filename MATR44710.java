import java.util.Scanner;
import java.util.*;

public class MATR44710 {

	public static void main(String[] args) {
		System.out.println("Quaderberechnung");
		Scanner scanner = new Scanner(System.in);
		
		A:
			
		System.out.print("Seite a: ");
		String sa = scanner.nextLine();
		double a = Double.parseDouble(sa); 
		
		System.out.print("Seite b: ");
		String sb = scanner.nextLine();
		double b = Double.parseDouble(sb);

		System.out.print("Seite c: ");
		String sc = scanner.nextLine();
		double c = Double.parseDouble(sc);
		
		System.out.println("[V]olumen oder [R]aumdiagonale berechnen?");
		String sx = scanner.nextLine();
		char x = charAt(sx);
		
		switch(x) {
			case 'V':
			{
				double v = a*b*c;
				System.out.println("Das Volumen beträgt " + v + " ve.");
				break;
			}
			default:
			{
				double qa = a*a + b*b + c*c;
				double r = Math.sqrt(qa);
				System.out.println("Die Länge der Raumdiagonalen betragt " + r + " le.");
				break;
			}
				
		}
		System.out.println("Nochmal rechnen [J|N]: " );
		String sy = scanner.nextLine();
		char y = charAt(sy);
		if(y<>'J')
		{
			scanner.close();
			exit;
		}
		else goto A;
	}}
		
		

