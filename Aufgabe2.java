package mein.paket;

public class Aufgabe2 {

	/* die Methode schneidet die ZAHL um STELLEN Zahlen */
	public static long abschneiden(long zahl, int stellen) {
		/* um zu STELLEN Ziffern die ZAHL zu abschneiden
		 * braeuchten wir die ZAHL durch 10 hoch STELLEN dividieren*/
		return  (long)(zahl/Math.pow(10, stellen)); // wir sollten hier Cast nutzen da die Methode long Typ hat
	}
	
	public static void main(String[] args) {
		System.out.println(abschneiden(1234567,2));
		System.out.println(abschneiden(1234567,4));
	}

}
