package mein.paket;

public class Dreieck {
	static double quadrat( double wert ) {
	    double ergebnis = wert * wert;
	    
	    return ergebnis;
	    }
	static double umfang( double wert1, double wert2, double wert3 ) {
	    double ergebnis = wert1 + wert2 + wert3;
	    
	    return ergebnis;
	    }
	static double halbUmfang( double wert1, double wert2, double wert3 ) {
	    double i = umfang(wert1,wert2,wert3)/2;
	    return i;
	    }
	// double f = Math.sqrt(halbUmfang(wert1,wert2,wert3))

	public static void main(String[] args) {
		double a=4.5;
		double b=5.5;
		double c=8.5;
		System.out.println("Gegeben sind die seiten von einem Dreieck:\n"
				+ "a=" + a + "cm, b=" + b + "cm, c=" + c + "cm");
		System.out.println("Sein Umfang =" + umfang(a,b,c));
		System.out.println("Sein Umfang =" + halbUmfang(a,b,c));
		
	}

}
