package mein.paket;

public class VolumeKugel {
	static double hoch_drei( double wert ) {
	    double ergebnis = wert * wert * wert;
	    return ergebnis;
	    }
	static double volumen_kugel( double wert ) {
	    double ergebnis = (4  * Math.PI * hoch_drei(wert)) / 3; // fragen ueber *4/3 ergebnis wird dann anderes
	    return ergebnis;
	    }
	

	public static void main(String[] args) {
		System.out.println("Volumen einer Kugel mit Radius r=" + 5.5 + " cm ist gleich " + volumen_kugel(5.5));

	}

}
