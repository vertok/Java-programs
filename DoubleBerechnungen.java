package mein.paket;

public class DoubleBerechnungen {
	static double quadrat( double wert ) {
	    double ergebnis = wert * wert;
	    
	    return ergebnis;
	    }

	public static void main(String[] args) {
		double d1=0.1;
		double d2=0.1;
		double d3=0.1;
		double d4=1.0;
		System.out.println("normal:"+(d1+d2+d3+d4)+ "\n");
		/* umgekehrt wird die andere Ergebniss ausgeben */
		System.out.println("\numgekehrt:" +(d1+d4+d2+d3)+ "\n");
		double abstand = Math.
				sqrt(quadrat(4.5-1.5)+quadrat(2.0-1.5)+quadrat(1.0-0.5));
		System.out.println("A=(" + 1.5 + ", " + 1.5 + ", " + 0.5 + ")");
		System.out.println("B=(" + 4.5 + ", " + 2.0 + ", " + 1.0 + ")");
		/* in der Ausgabe runden wir unser Ergebnis bis zwei Nachkommastellen */
		System.out.println("Abstand zwischen den beiden Punkten A und B ist gleich " + (double)Math.round(abstand * 100) / 100);
	}

}
