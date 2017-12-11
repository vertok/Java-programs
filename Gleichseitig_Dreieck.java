package mein.paket;

public class Gleichseitig_Dreieck {
	
	static double quadrat( double wert ) {
	    double ergebnis = wert * wert;
	    
	    return ergebnis;
	    }
	static double umfang( double wert ) {
	    double ergebnis = wert * 3;
	    return ergebnis;
	    }
	static double flaeche( double wert ) {
	    double ergebnis = (quadrat(wert) * Math.sqrt(3.0)) / 4;
	    return ergebnis;
	    }
	public static void main(String[] args) {
		System.out.println("Umfang eines gleichseitigen Dreiecks \nmit der Seite a=" 
										+ 10.5 + " ist gleich " + umfang(10.5) + "\n");
		System.out.println("Flaeche eines gleichseitigen Dreiecks \nmit der Seite a=" 
										+ 10.5 + " ist gleich " + flaeche(10.5));
	}

}
