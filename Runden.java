package mein.paket;

public class Runden {

	public static void main(String[] args) {
		double zahl = 9.999;
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = 0.3;
		double d4 = 0.4;
		int i =(int)zahl;
		int j;
		System.out.println(i);
		i = (int) (d1+d2+d3+d4);
		System.out.println(i);
		j = (int) (d1+d3+d4+d2); // veränderte die Reihenfolge der Summanden
		System.out.println(j);
		int foo =(int)(0.4);
		System.out.println("Die Zahl "+ 0.4 + " wird abgerundet zu " +foo);
		foo =(int)(0.8);
		System.out.println("Die Zahl "+ 0.8 + " wird abgerundet zu " +foo);
		foo =(int)(1.5);
		System.out.println("Die Zahl "+ 1.5 + " wird abgerundet zu " +foo);
		foo =(int)(5.0);
		System.out.println("Die Zahl "+ 5.0 + " wird abgerundet zu " +foo);
		foo =(int)(-1.1);
		System.out.println("Die Zahl "+ (-1.1) + " wird abgerundet zu " +foo);
		foo =(int)(-1.9);
		System.out.println("Die Zahl "+ (-1.9) + " wird abgerundet zu " +foo);
	}

}
