package mein.paket;

public class nachkommastellenNachDivision {

	
	public static double division(int zaehler, int nenner) {
		return ((double)(zaehler%nenner))/nenner;		
	}
	
	
	public static void main(String[] args) {
		System.out.println(division(7,2));
		System.out.println(division(5,4));

	}

}
