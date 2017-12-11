package mein.paket;

public class MinMax {

	public static void main(String[] args) {
		double e = 1.5;
		double f = 2.5;
		System.out.println("Minimum von den Zahlen e=" + e + 
				" und f=" + f + " wird " + Math.min(e, f));
		System.out.println("Maximum von den Zahlen e=" + e + 
				" und f=" + f + " wird " + Math.max(e, f));
		System.out.println("Absolutwert der Differenz der beiden Zahlen e=" + e + 
				" und f=" + f + " wird " + Math.abs(e-f));		
	}
}
