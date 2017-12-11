package mein.paket;

public class istTeilbar {

	public static boolean teilbar(int zaehler, int nenner){
		if((zaehler%nenner)>0)
			return false;
		else	
			return true;
		
	}
	public static void main(String[] args) {
		System.out.println(teilbar(8,4));
		System.out.println(teilbar(41,7));
	}

}
