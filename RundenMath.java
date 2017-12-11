package mein.paket;

public class RundenMath {

	public static void main(String[] args) {
		int foo =(int) Math.round(0.4);
		System.out.println("Die Zahl "+ 0.4 + " wird abgerundet zu " +foo);
		foo =(int) Math.round(0.8);
		System.out.println("Die Zahl "+ 0.8 + " wird abgerundet zu " +foo);
		foo =(int) Math.round(1.5);
		System.out.println("Die Zahl "+ 1.5 + " wird aufgerundet zu " +foo);
		foo =(int) Math.round(5.0);
		System.out.println("Die Zahl "+ 5.0 + " wird abgerundet zu " +foo);
		foo =(int) Math.round(-1.1);
		System.out.println("Die Zahl "+ (-1.1) + " wird aufgerundet zu " +foo);
		foo =(int) Math.round(-1.9);
		System.out.println("Die Zahl "+ (-1.9) + " wird abgerundet zu " +foo);

	}

}
