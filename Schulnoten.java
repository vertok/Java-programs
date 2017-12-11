package mein.paket;

public class Schulnoten {

	/* einfache Pruefung ob bestanden oder nicht*/
	static boolean bestanden(int punkte) {
		if(punkte<=50) {
			System.out.println("Sie haben die Pruefung nicht bestanden");
			return false;
		}
		else {
			System.out.println("Sie haben die Pruefung bestanden");
			return true;
		}
	}
	
	/* die Methode schreibt noch dazu die Maximale Anzahl der Punkten */
	static boolean bestanden(int punkte, int maxPunkte) {
		double tmp=((double)punkte/(double)maxPunkte)*100; // die Variable nutzt man um % zu berechnen
		if(tmp<=50.0) {
			System.out.println("Die maximal moegliche Punktzahl war " + maxPunkte+ ". Sie haben leider aber nur " + punkte + " erreicht");
			return false;
		}
		else {
			System.out.println("Die maximal moegliche Punktzahl war " + maxPunkte+ ". Sie haben aber " + punkte + " erreicht! Good job!");
			return true;
		}	
	}
	
	/* die Methode gibt zusaetzlich Schuelern die Auszeichnung, falls die Bedingungen erfuehlt sind */
	static boolean bestanden( int punkte, int maxPunkte, double grenze) {
		if((double)punkte<(double)(maxPunkte/2)) {
			System.out.println("Die maximal moegliche Punktzahl war " + maxPunkte+ ". Sie haben leider aber nur " + punkte + " erreicht");
			return false;
		}
		else {
			if(((double)(punkte))/((double)(maxPunkte))<grenze) {
				System.out.println("Die maximal moegliche Punktzahl war " + maxPunkte+ ". Sie haben aber " + punkte + " erreicht!");
				return true;
			}
			else {
				System.out.println("Die maximal moegliche Punktzahl war " + maxPunkte+ ". Sie haben aber " + punkte + " erreicht! Das ist perfekt! Sie kriegen noch eine Auszeichung!");
				return true;
				}
		}
	}
	
	/*die Methode erhaelt ganzzahlige NOTE und liefert die string NAMEDERNOTE zurueck*/
	public static String note(int note) {
		String NameDerNote = null;
		switch(note) {
			case 1: NameDerNote = "sehr gut"; break;
			case 2: NameDerNote = "gut"; break; 
			case 3: NameDerNote = "befriedigend"; break;
			case 4: NameDerNote = "ausreichend"; break;
			case 5: NameDerNote = "mangelhaft"; break;
			case 6: NameDerNote = "ungenuegend"; break;
			default : NameDerNote = "ungueltiger Notenwert"; break;
		}
		return NameDerNote;	
	}
	
	public static int bewertung( int punkte) {
		int NoteAlsZahl = 0;
		switch((int)punkte/10) {
		case 8: case 9: case 10:
			NoteAlsZahl = 1;
			break;
		case 7:
			NoteAlsZahl = 2;
			break;
		case 6:
			NoteAlsZahl = 3;
			break;
		case 5:
			NoteAlsZahl = 4;
			break;
		case 4:
			NoteAlsZahl = 5;
			break;
		case 3: case 2: case 1: case 0:
			if(punkte<0) { /*diese Line ist fuer die Punkten -1..-9, da z.b. -4/10=0 auch */
				System.out.println("Die ungueltige Eingabe");
				break;
			}
				
			else {
				NoteAlsZahl = 6;
				break;
			}
		default: 
			System.out.println("Die ungueltige Eingabe");
			break;		
		}		
		return NoteAlsZahl;
		
	}
	
	
	public static void main(String[] args) {
		//System.out.println("1. " + bestanden( 56));
		//System.out.println("2. " + bestanden( 46, 95));
		//System.out.println("3. " + bestanden( 46, 50, 0.9));
		  int x = 5; // mit der Variable testet man die naechste Ausgabe
		  System.out.println("Ausgabe fuer die Note " + x +" : " + note(x));
		  System.out.println(bewertung(40));
	}

}
