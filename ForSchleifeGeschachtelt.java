package mein.paket;

public class ForSchleifeGeschachtelt {

	public static void main(String[] args) {
		String s="*";
		for(int i=0; i<20; i++) {
			for(int j=0; j<i; j++)
			System.out.print(s);
		System.out.println("");
		}

	}

}
