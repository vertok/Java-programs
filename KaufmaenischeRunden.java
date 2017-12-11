package mein.paket;
/* die Methode aufrundet alle Zeile, deren Nachkommazeil >= 0.3 
 * und 		   abrundet  alle Zeile, deren Nachkommazeil <0.3 */
public class KaufmaenischeRunden {
	static int Kaufmaenisch_runden (double zahl) {
	if(zahl<((int)(zahl)+0.3)) {
			return (int)(zahl); // abrunden
	}
	else
		return (int)(zahl)+1; // aufrunden
}

	public static void main(String[] args) {
		int ergebnis = Kaufmaenisch_runden(5.1);
		System.out.println("Kaufmaenisch Runden von der Zahl " + 5.1 + " ist gleich " + ergebnis);
		ergebnis = Kaufmaenisch_runden(5.2999);
		System.out.println("Kaufmaenisch Runden von der Zahl " + 5.2999 + " ist gleich " + ergebnis);
		ergebnis = Kaufmaenisch_runden(5.3);
		System.out.println("Kaufmaenisch Runden von der Zahl " + 5.3 + " ist gleich " + ergebnis);
	}

}
