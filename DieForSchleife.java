package mein.paket;

public class DieForSchleife {

	public static void main(String[] args) {
		for(int i=0; i<10; i++)
			System.out.println("\n" + i*7);
		for(int i=-3; i<=11; i++) {
			if(i==0 || i==5) continue;
			else
				System.out.println("\n" + i);
		}

	}

}
