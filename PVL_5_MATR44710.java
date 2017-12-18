/*
 * Alexey Obukhov
 * Matr.-Nr.: 44710
 */
public class PVL_5_MATR44710 {
	
	static int ergebnis=0;
	
	
	public static int berechnung(int a, int b) {
		if(a>b) { 
			return ergebnis;
		}
		else { 
			ergebnis = ergebnis + b*b; 
			return berechnung(a, b-1);
		}
	}
	
	
	public static void drucke(int a, int b) { 
		for(int countY=0; countY<b;countY++) {
			for(int countX=1; countX<=a;countX++)
				System.out.print(" " + countX);
		System.out.println();
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Gruppe C");
		System.out.println(berechnung(2, 4));ergebnis=0;// we need to set our static variable ergebnis as 0 every time after every call of our methode berechnung
		System.out.println(berechnung(1, 3));ergebnis=0;
		System.out.println(berechnung(5, 2));ergebnis=0;
		System.out.println("---");
		
		drucke(4, 3);
		System.out.println("---");
		drucke(3, 5);
	
	}

}
