package mein.paket;

public class Fakultaet {

	public static long fak(int n) {
		if(n==0) return 0;
		else
			if(n==1) return 1;
			else
				return n*fak(n-1);
	}
	public static void main(String[] args) {
		System.out.println(fak(5));

	}

}
