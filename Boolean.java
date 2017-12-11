package mein.paket;

public class Boolean {

	public static boolean magic( boolean a, boolean b, boolean c) {
		boolean ergebniss = a&b&c;
		return ergebniss;
	}
	public static void main(String[] args) {
		System.out.println(magic(true,false,true));

	}

}
